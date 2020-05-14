package cz.zoomint.e2e.poc2.extensions;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import static org.junit.jupiter.api.extension.ExtensionContext.Namespace.GLOBAL;

public class GenesysEnvironmentExtension implements BeforeAllCallback, AfterAllCallback, ExtensionContext.Store.CloseableResource{

	private static boolean genesysReady = false;

	@Override
	public void beforeAll(ExtensionContext extensionContext) throws Exception {
		System.out.println("GENESYS BeforeAllCallback");
		systemSetup();
		extensionContext.getRoot().getStore(GLOBAL).put(genesysReady, this);
	}

	@Override
	public void afterAll(ExtensionContext extensionContext) throws Exception {
		System.out.println("GENESYS AfterAllCallback");
	}

	synchronized private static void systemSetup() throws Exception {
		// 'if' is used to make sure procedure will be executed only once, not before every class
		System.out.println("GENESYS Before system setup");
		if (!genesysReady) {
			genesysReady = true;
			System.out.println("GENESYS System setup");
			//
			// Put your system setup here. It will be executed only once, before all test classes
			// No tests will be started until this procedure finish
			// This procedure will be executed only once across all parallel threads
			//
		}
	}

	@Override
	public void close() throws Throwable {
		System.out.println("GENESYS Close");
	}
}
