package cz.zoomint.e2e.poc2.extensions;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.extension.ExtensionContext.Namespace.GLOBAL;

public class CucmEnvironmentExtension implements BeforeAllCallback, AfterAllCallback, ExtensionContext.Store.CloseableResource {

	private static boolean cucmReady = false;

	@Override
	public void beforeAll(ExtensionContext extensionContext) throws Exception {
		System.out.println("CUCM BeforeAllCallback");
		systemSetup(extensionContext);
		extensionContext.getRoot().getStore(GLOBAL).put(cucmReady, this);
	}

	@Override
	public void afterAll(ExtensionContext extensionContext) throws Exception {
		System.out.println("CUCM AfterAllCallback");
	}

	synchronized private static void systemSetup(ExtensionContext extensionContext) throws Exception {
		// 'if' is used to make sure procedure will be executed only once, not before every class
		if (!cucmReady) {
			cucmReady = true;
			System.out.println("CUCM System setup");
			//
			// Put your system setup here. It will be executed only once, before all test classes
			// No tests will be started until this procedure finish
			// This procedure will be executed only once across all parallel threads
			//
		}
	}

	@Override
	public void close() throws Throwable {
		System.out.println("CUCM Close");
	}
}
