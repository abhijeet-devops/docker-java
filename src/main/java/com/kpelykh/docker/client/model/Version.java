package com.kpelykh.docker.client.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author Konstantin Pelykh (kpelykh@gmail.com)
 *
 */
public class Version {


    @JsonProperty("Version")
    private String version;

    @JsonProperty("GitCommit")
    private String  gitCommit;

    @JsonProperty("GoVersion")
    private String  goVersion;
    
    @JsonProperty("Arch")
    private String  arch;
    
    @JsonProperty("KernelVersion")
    private String  kernelVersion;
    
    @JsonProperty("Os")
    private String operatingSystem;

    public String getVersion() {
        return version;
    }

    public String getGitCommit() {
        return gitCommit;
    }

    public String getGoVersion() {
        return goVersion;
    }

    public String getArch() {
		return arch;
	}

	public void setArch(String arch) {
		this.arch = arch;
	}

	public String getKernelVersion() {
		return kernelVersion;
	}

	public void setKernelVersion(String kernelVersion) {
		this.kernelVersion = kernelVersion;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	@Override
    public String toString() {
        return "Version{" +
                "version='" + version + '\'' +
                ", gitCommit='" + gitCommit + '\'' +
                ", goVersion='" + goVersion + '\'' +
                ", Arch='" + arch + '\'' +
                ", os='" + operatingSystem + '\'' +
                ", kernelVersion='" + kernelVersion + '\'' +
                '}';
    }

}
