package org.opfx.jenkins.phpinstaller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.List;

import org.kohsuke.stapler.DataBoundConstructor;

import hudson.Extension;
import hudson.tools.DownloadFromUrlInstaller;
import hudson.tools.ToolInstallation;

public class Installer extends DownloadFromUrlInstaller{

	@DataBoundConstructor
	public Installer(String id) {
		super(id);
	}
	
	@Override
	public DescriptorImpl getDescriptor() {
		return (DescriptorImpl)super.getDescriptor();
	}

	@Extension
	public static final class DescriptorImpl extends DownloadFromUrlInstaller.DescriptorImpl<Installer> {

		@Override
		public String getDisplayName() {
			return "Available versions";
		}
		
		@Override
		public boolean isApplicable(Class<? extends ToolInstallation>toolClass) {
			return toolClass == Installation.class;
		}
		
		@Override
		public List<? extends Installable> getInstallables() throws IOException {
			// TODO > P0 : Installer::getInstallables() implementation
			return Collections.emptyList();
		}
		
		private void updateInstallationData(URL source, File target) {
			// TODO > P0 : Installer::updateInstallationData implementation
		}
		
		
		
	}
}
