package org.opfx.jenkins.phpinstaller;

import java.util.Collections;
import java.util.List;

import org.kohsuke.stapler.DataBoundConstructor;

import hudson.CopyOnWrite;
import hudson.Extension;
import hudson.WebAppMain;
import hudson.tools.ToolDescriptor;
import hudson.tools.ToolInstallation;
import hudson.tools.ToolInstaller;

public class Installation extends ToolInstallation {

	@DataBoundConstructor
	public Installation(String name, String home) {
		super(name, home);
	}
	
	public String getHome() {
		
		return "/php/home";
	}
	
	@Extension
	public static final class Descriptor extends ToolDescriptor<Installation> {

		@CopyOnWrite
		private volatile Installation[] installations = new Installation[0];
		
		public Descriptor() {
			super();
			load();
		}
		
		@Override
		public String getDisplayName() {
			return "PHP";
		}
		
		@Override
		public List<?extends ToolInstaller>getDefaultInstallers() {
			//TODO > P1 : Installation::getDefaultInstallers();
			return Collections.singletonList(new Installer(null));
		}
		
		@Override
		public Installation[] getInstallations() {
			return installations;
		}
		
		public void setInstallations(Installation... installations) {
			this.installations = installations;
			save();
		}
		
		
		
	}

}
