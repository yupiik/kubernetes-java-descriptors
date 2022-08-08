package io.yupiik.kubernetes.bindings.v1_16_9;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecEphemeralContainers {
    private List<String> args;
    private List<String> command;
    private List<DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnv> env;
    private List<DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecycle lifecycle;
    private DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbe livenessProbe;
    private String name;
    private List<DaemonSetListItemsSpecTemplateSpecEphemeralContainersPorts> ports;
    private DaemonSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbe readinessProbe;
    private DaemonSetListItemsSpecTemplateSpecEphemeralContainersResources resources;
    private DaemonSetListItemsSpecTemplateSpecEphemeralContainersSecurityContext securityContext;
    private DaemonSetListItemsSpecTemplateSpecEphemeralContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String targetContainerName;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<DaemonSetListItemsSpecTemplateSpecEphemeralContainersVolumeDevices> volumeDevices;
    private List<DaemonSetListItemsSpecTemplateSpecEphemeralContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainers() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainers(final List<String> args,
                                                                 final List<String> command,
                                                                 final List<DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnv> env,
                                                                 final List<DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvFrom> envFrom,
                                                                 final String image,
                                                                 final String imagePullPolicy,
                                                                 final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecycle lifecycle,
                                                                 final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbe livenessProbe,
                                                                 final String name,
                                                                 final List<DaemonSetListItemsSpecTemplateSpecEphemeralContainersPorts> ports,
                                                                 final DaemonSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbe readinessProbe,
                                                                 final DaemonSetListItemsSpecTemplateSpecEphemeralContainersResources resources,
                                                                 final DaemonSetListItemsSpecTemplateSpecEphemeralContainersSecurityContext securityContext,
                                                                 final DaemonSetListItemsSpecTemplateSpecEphemeralContainersStartupProbe startupProbe,
                                                                 final Boolean stdin,
                                                                 final Boolean stdinOnce,
                                                                 final String targetContainerName,
                                                                 final String terminationMessagePath,
                                                                 final String terminationMessagePolicy,
                                                                 final Boolean tty,
                                                                 final List<DaemonSetListItemsSpecTemplateSpecEphemeralContainersVolumeDevices> volumeDevices,
                                                                 final List<DaemonSetListItemsSpecTemplateSpecEphemeralContainersVolumeMounts> volumeMounts,
                                                                 final String workingDir) {
        // no-op
    }

    public List<String> getArgs() {
        return args;
    }

    public void setArgs(final List<String> args) {
        this.args = args;
    }

    public List<String> getCommand() {
        return command;
    }

    public void setCommand(final List<String> command) {
        this.command = command;
    }

    public List<DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnv> env) {
        this.env = env;
    }

    public List<DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvFrom> envFrom) {
        this.envFrom = envFrom;
    }

    public String getImage() {
        return image;
    }

    public void setImage(final String image) {
        this.image = image;
    }

    public String getImagePullPolicy() {
        return imagePullPolicy;
    }

    public void setImagePullPolicy(final String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<DaemonSetListItemsSpecTemplateSpecEphemeralContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<DaemonSetListItemsSpecTemplateSpecEphemeralContainersPorts> ports) {
        this.ports = ports;
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersResources getResources() {
        return resources;
    }

    public void setResources(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersResources resources) {
        this.resources = resources;
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersStartupProbe startupProbe) {
        this.startupProbe = startupProbe;
    }

    public Boolean getStdin() {
        return stdin;
    }

    public void setStdin(final Boolean stdin) {
        this.stdin = stdin;
    }

    public Boolean getStdinOnce() {
        return stdinOnce;
    }

    public void setStdinOnce(final Boolean stdinOnce) {
        this.stdinOnce = stdinOnce;
    }

    public String getTargetContainerName() {
        return targetContainerName;
    }

    public void setTargetContainerName(final String targetContainerName) {
        this.targetContainerName = targetContainerName;
    }

    public String getTerminationMessagePath() {
        return terminationMessagePath;
    }

    public void setTerminationMessagePath(final String terminationMessagePath) {
        this.terminationMessagePath = terminationMessagePath;
    }

    public String getTerminationMessagePolicy() {
        return terminationMessagePolicy;
    }

    public void setTerminationMessagePolicy(final String terminationMessagePolicy) {
        this.terminationMessagePolicy = terminationMessagePolicy;
    }

    public Boolean getTty() {
        return tty;
    }

    public void setTty(final Boolean tty) {
        this.tty = tty;
    }

    public List<DaemonSetListItemsSpecTemplateSpecEphemeralContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<DaemonSetListItemsSpecTemplateSpecEphemeralContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<DaemonSetListItemsSpecTemplateSpecEphemeralContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<DaemonSetListItemsSpecTemplateSpecEphemeralContainersVolumeMounts> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }

    public String getWorkingDir() {
        return workingDir;
    }

    public void setWorkingDir(final String workingDir) {
        this.workingDir = workingDir;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                args,
                command,
                env,
                envFrom,
                image,
                imagePullPolicy,
                lifecycle,
                livenessProbe,
                name,
                ports,
                readinessProbe,
                resources,
                securityContext,
                startupProbe,
                stdin,
                stdinOnce,
                targetContainerName,
                terminationMessagePath,
                terminationMessagePolicy,
                tty,
                volumeDevices,
                volumeMounts,
                workingDir);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecEphemeralContainers)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecEphemeralContainers __otherCasted = (DaemonSetListItemsSpecTemplateSpecEphemeralContainers) __other;
        return Objects.equals(args, __otherCasted.args) &&
            Objects.equals(command, __otherCasted.command) &&
            Objects.equals(env, __otherCasted.env) &&
            Objects.equals(envFrom, __otherCasted.envFrom) &&
            Objects.equals(image, __otherCasted.image) &&
            Objects.equals(imagePullPolicy, __otherCasted.imagePullPolicy) &&
            Objects.equals(lifecycle, __otherCasted.lifecycle) &&
            Objects.equals(livenessProbe, __otherCasted.livenessProbe) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(ports, __otherCasted.ports) &&
            Objects.equals(readinessProbe, __otherCasted.readinessProbe) &&
            Objects.equals(resources, __otherCasted.resources) &&
            Objects.equals(securityContext, __otherCasted.securityContext) &&
            Objects.equals(startupProbe, __otherCasted.startupProbe) &&
            Objects.equals(stdin, __otherCasted.stdin) &&
            Objects.equals(stdinOnce, __otherCasted.stdinOnce) &&
            Objects.equals(targetContainerName, __otherCasted.targetContainerName) &&
            Objects.equals(terminationMessagePath, __otherCasted.terminationMessagePath) &&
            Objects.equals(terminationMessagePolicy, __otherCasted.terminationMessagePolicy) &&
            Objects.equals(tty, __otherCasted.tty) &&
            Objects.equals(volumeDevices, __otherCasted.volumeDevices) &&
            Objects.equals(volumeMounts, __otherCasted.volumeMounts) &&
            Objects.equals(workingDir, __otherCasted.workingDir);
    }
}
