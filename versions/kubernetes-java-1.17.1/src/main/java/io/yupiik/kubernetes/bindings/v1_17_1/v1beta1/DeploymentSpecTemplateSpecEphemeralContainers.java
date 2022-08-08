package io.yupiik.kubernetes.bindings.v1_17_1.v1beta1;

import java.util.List;
import java.util.Objects;

public class DeploymentSpecTemplateSpecEphemeralContainers {
    private List<String> args;
    private List<String> command;
    private List<DeploymentSpecTemplateSpecEphemeralContainersEnv> env;
    private List<DeploymentSpecTemplateSpecEphemeralContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private DeploymentSpecTemplateSpecEphemeralContainersLifecycle lifecycle;
    private DeploymentSpecTemplateSpecEphemeralContainersLivenessProbe livenessProbe;
    private String name;
    private List<DeploymentSpecTemplateSpecEphemeralContainersPorts> ports;
    private DeploymentSpecTemplateSpecEphemeralContainersReadinessProbe readinessProbe;
    private DeploymentSpecTemplateSpecEphemeralContainersResources resources;
    private DeploymentSpecTemplateSpecEphemeralContainersSecurityContext securityContext;
    private DeploymentSpecTemplateSpecEphemeralContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String targetContainerName;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<DeploymentSpecTemplateSpecEphemeralContainersVolumeDevices> volumeDevices;
    private List<DeploymentSpecTemplateSpecEphemeralContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public DeploymentSpecTemplateSpecEphemeralContainers() {
        // no-op
    }

    public DeploymentSpecTemplateSpecEphemeralContainers(final List<String> args,
                                                         final List<String> command,
                                                         final List<DeploymentSpecTemplateSpecEphemeralContainersEnv> env,
                                                         final List<DeploymentSpecTemplateSpecEphemeralContainersEnvFrom> envFrom,
                                                         final String image,
                                                         final String imagePullPolicy,
                                                         final DeploymentSpecTemplateSpecEphemeralContainersLifecycle lifecycle,
                                                         final DeploymentSpecTemplateSpecEphemeralContainersLivenessProbe livenessProbe,
                                                         final String name,
                                                         final List<DeploymentSpecTemplateSpecEphemeralContainersPorts> ports,
                                                         final DeploymentSpecTemplateSpecEphemeralContainersReadinessProbe readinessProbe,
                                                         final DeploymentSpecTemplateSpecEphemeralContainersResources resources,
                                                         final DeploymentSpecTemplateSpecEphemeralContainersSecurityContext securityContext,
                                                         final DeploymentSpecTemplateSpecEphemeralContainersStartupProbe startupProbe,
                                                         final Boolean stdin,
                                                         final Boolean stdinOnce,
                                                         final String targetContainerName,
                                                         final String terminationMessagePath,
                                                         final String terminationMessagePolicy,
                                                         final Boolean tty,
                                                         final List<DeploymentSpecTemplateSpecEphemeralContainersVolumeDevices> volumeDevices,
                                                         final List<DeploymentSpecTemplateSpecEphemeralContainersVolumeMounts> volumeMounts,
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

    public List<DeploymentSpecTemplateSpecEphemeralContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<DeploymentSpecTemplateSpecEphemeralContainersEnv> env) {
        this.env = env;
    }

    public List<DeploymentSpecTemplateSpecEphemeralContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<DeploymentSpecTemplateSpecEphemeralContainersEnvFrom> envFrom) {
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

    public DeploymentSpecTemplateSpecEphemeralContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final DeploymentSpecTemplateSpecEphemeralContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public DeploymentSpecTemplateSpecEphemeralContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final DeploymentSpecTemplateSpecEphemeralContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<DeploymentSpecTemplateSpecEphemeralContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<DeploymentSpecTemplateSpecEphemeralContainersPorts> ports) {
        this.ports = ports;
    }

    public DeploymentSpecTemplateSpecEphemeralContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final DeploymentSpecTemplateSpecEphemeralContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public DeploymentSpecTemplateSpecEphemeralContainersResources getResources() {
        return resources;
    }

    public void setResources(final DeploymentSpecTemplateSpecEphemeralContainersResources resources) {
        this.resources = resources;
    }

    public DeploymentSpecTemplateSpecEphemeralContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final DeploymentSpecTemplateSpecEphemeralContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public DeploymentSpecTemplateSpecEphemeralContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final DeploymentSpecTemplateSpecEphemeralContainersStartupProbe startupProbe) {
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

    public List<DeploymentSpecTemplateSpecEphemeralContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<DeploymentSpecTemplateSpecEphemeralContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<DeploymentSpecTemplateSpecEphemeralContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<DeploymentSpecTemplateSpecEphemeralContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecEphemeralContainers)) {
            return false;
        }
        final DeploymentSpecTemplateSpecEphemeralContainers __otherCasted = (DeploymentSpecTemplateSpecEphemeralContainers) __other;
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
