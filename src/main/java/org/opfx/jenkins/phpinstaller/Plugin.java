package org.opfx.jenkins.phpinstaller;

import java.util.logging.Logger;

public class Plugin extends hudson.Plugin{
	private final static Logger LOG = Logger.getLogger(Plugin.class.getName());
	static Logger getLogger() {
		return LOG;
	}

}
