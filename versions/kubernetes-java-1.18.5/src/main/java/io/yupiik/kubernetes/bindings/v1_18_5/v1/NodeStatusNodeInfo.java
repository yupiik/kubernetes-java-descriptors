package io.yupiik.kubernetes.bindings.v1_18_5.v1;

import java.util.Objects;

public class NodeStatusNodeInfo {
    private String architecture;
    private String bootID;
    private String containerRuntimeVersion;
    private String kernelVersion;
    private String kubeProxyVersion;
    private String kubeletVersion;
    private String machineID;
    private String operatingSystem;
    private String osImage;
    private String systemUUID;

    public NodeStatusNodeInfo() {
        // no-op
    }

    public NodeStatusNodeInfo(final String architecture,
                              final String bootID,
                              final String containerRuntimeVersion,
                              final String kernelVersion,
                              final String kubeProxyVersion,
                              final String kubeletVersion,
                              final String machineID,
                              final String operatingSystem,
                              final String osImage,
                              final String systemUUID) {
        // no-op
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(final String architecture) {
        this.architecture = architecture;
    }

    public String getBootID() {
        return bootID;
    }

    public void setBootID(final String bootID) {
        this.bootID = bootID;
    }

    public String getContainerRuntimeVersion() {
        return containerRuntimeVersion;
    }

    public void setContainerRuntimeVersion(final String containerRuntimeVersion) {
        this.containerRuntimeVersion = containerRuntimeVersion;
    }

    public String getKernelVersion() {
        return kernelVersion;
    }

    public void setKernelVersion(final String kernelVersion) {
        this.kernelVersion = kernelVersion;
    }

    public String getKubeProxyVersion() {
        return kubeProxyVersion;
    }

    public void setKubeProxyVersion(final String kubeProxyVersion) {
        this.kubeProxyVersion = kubeProxyVersion;
    }

    public String getKubeletVersion() {
        return kubeletVersion;
    }

    public void setKubeletVersion(final String kubeletVersion) {
        this.kubeletVersion = kubeletVersion;
    }

    public String getMachineID() {
        return machineID;
    }

    public void setMachineID(final String machineID) {
        this.machineID = machineID;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(final String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getOsImage() {
        return osImage;
    }

    public void setOsImage(final String osImage) {
        this.osImage = osImage;
    }

    public String getSystemUUID() {
        return systemUUID;
    }

    public void setSystemUUID(final String systemUUID) {
        this.systemUUID = systemUUID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                architecture,
                bootID,
                containerRuntimeVersion,
                kernelVersion,
                kubeProxyVersion,
                kubeletVersion,
                machineID,
                operatingSystem,
                osImage,
                systemUUID);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeStatusNodeInfo)) {
            return false;
        }
        final NodeStatusNodeInfo __otherCasted = (NodeStatusNodeInfo) __other;
        return Objects.equals(architecture, __otherCasted.architecture) &&
            Objects.equals(bootID, __otherCasted.bootID) &&
            Objects.equals(containerRuntimeVersion, __otherCasted.containerRuntimeVersion) &&
            Objects.equals(kernelVersion, __otherCasted.kernelVersion) &&
            Objects.equals(kubeProxyVersion, __otherCasted.kubeProxyVersion) &&
            Objects.equals(kubeletVersion, __otherCasted.kubeletVersion) &&
            Objects.equals(machineID, __otherCasted.machineID) &&
            Objects.equals(operatingSystem, __otherCasted.operatingSystem) &&
            Objects.equals(osImage, __otherCasted.osImage) &&
            Objects.equals(systemUUID, __otherCasted.systemUUID);
    }
}
