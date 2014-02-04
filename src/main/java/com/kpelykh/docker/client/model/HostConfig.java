package com.kpelykh.docker.client.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author Konstantin Pelykh (kpelykh@gmail.com)
 *
 */
public class HostConfig {

    @JsonProperty("Binds")
    private String[] binds;

    @JsonProperty("ContainerIDFile")
    private String containerIDFile;

    @JsonProperty("LxcConf")
    private LxcConf[] lxcConf;
    
    @JsonProperty("Links")
    private String[] links;
    
    @JsonProperty("PortBindings")
    private Ports portBindings;
    
	@JsonProperty("Privileged")
    private boolean privileged;
    
    @JsonProperty("PublishAllPorts")
    private boolean publishAllPorts;

    public String[] getLinks() {
		return links;
	}

	public void setLinks(String[] links) {
		this.links = links;
	}

	public boolean isPrivileged() {
		return privileged;
	}

	public void setPrivileged(boolean privileged) {
		this.privileged = privileged;
	}

	public boolean isPublishAllPorts() {
		return publishAllPorts;
	}

	public void setPublishAllPorts(boolean publishAllPorts) {
		this.publishAllPorts = publishAllPorts;
	}

	public HostConfig(String[] binds) {
        this.binds = binds;
    }
	
	public HostConfig() {
        this.binds = null;
    }

    public String[] getBinds() {
        return binds;
    }

    public void setBinds(String[] binds) {
        this.binds = binds;
    }

    public String getContainerIDFile() {
        return containerIDFile;
    }

    public void setContainerIDFile(String containerIDFile) {
        this.containerIDFile = containerIDFile;
    }

    public LxcConf[] getLxcConf() {
        return lxcConf;
    }

    public void setLxcConf(LxcConf[] lxcConf) {
        this.lxcConf = lxcConf;
    }
    
    public Ports getPortBindings() {
		return portBindings;
	}

	public void setPortBindings(Ports portBindings) {
		this.portBindings = portBindings;
	}

    public class LxcConf {
        @JsonProperty("Key")
        public String key;

        @JsonProperty("Value")
        public String value;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

    }
}
