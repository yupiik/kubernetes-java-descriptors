package io.yupiik.kubernetes.bindings.v1_23_1.v1;

import java.util.List;
import java.util.Objects;

public class DeploymentSpecTemplateSpecContainers {
    private List<String> args;
    private List<String> command;
    private List<DeploymentSpecTemplateSpecContainersEnv> env;
    private List<DeploymentSpecTemplateSpecContainersEnvFrom> envFrom;
    private String image;
    private DeploymentSpecTemplateSpecContainersImagePullPolicy imagePullPolicy;
    private DeploymentSpecTemplateSpecContainersLifecycle lifecycle;
    private DeploymentSpecTemplateSpecContainersLivenessProbe livenessProbe;
    private String name;
    private List<DeploymentSpecTemplateSpecContainersPorts> ports;
    private DeploymentSpecTemplateSpecContainersReadinessProbe readinessProbe;
    private DeploymentSpecTemplateSpecContainersResources resources;
    private DeploymentSpecTemplateSpecContainersSecurityContext securityContext;
    private DeploymentSpecTemplateSpecContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private DeploymentSpecTemplateSpecContainersTerminationMessagePolicy terminationMessagePolicy;
    private Boolean tty;
    private List<DeploymentSpecTemplateSpecContainersVolumeDevices> volumeDevices;
    private List<DeploymentSpecTemplateSpecContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public DeploymentSpecTemplateSpecContainers() {
        // no-op
    }

    public DeploymentSpecTemplateSpecContainers(final List<String> args,
                                                final List<String> command,
                                                final List<DeploymentSpecTemplateSpecContainersEnv> env,
                                                final List<DeploymentSpecTemplateSpecContainersEnvFrom> envFrom,
                                                final String image,
                                                final DeploymentSpecTemplateSpecContainersImagePullPolicy imagePullPolicy,
                                                final DeploymentSpecTemplateSpecContainersLifecycle lifecycle,
                                                final DeploymentSpecTemplateSpecContainersLivenessProbe livenessProbe,
                                                final String name,
                                                final List<DeploymentSpecTemplateSpecContainersPorts> ports,
                                                final DeploymentSpecTemplateSpecContainersReadinessProbe readinessProbe,
                                                final DeploymentSpecTemplateSpecContainersResources resources,
                                                final DeploymentSpecTemplateSpecContainersSecurityContext securityContext,
                                                final DeploymentSpecTemplateSpecContainersStartupProbe startupProbe,
                                                final Boolean stdin,
                                                final Boolean stdinOnce,
                                                final String terminationMessagePath,
                                                final DeploymentSpecTemplateSpecContainersTerminationMessagePolicy terminationMessagePolicy,
                                                final Boolean tty,
                                                final List<DeploymentSpecTemplateSpecContainersVolumeDevices> volumeDevices,
                                                final List<DeploymentSpecTemplateSpecContainersVolumeMounts> volumeMounts,
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

    public List<DeploymentSpecTemplateSpecContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<DeploymentSpecTemplateSpecContainersEnv> env) {
        this.env = env;
    }

    public List<DeploymentSpecTemplateSpecContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<DeploymentSpecTemplateSpecContainersEnvFrom> envFrom) {
        this.envFrom = envFrom;
    }

    public String getImage() {
        return image;
    }

    public void setImage(final String image) {
        this.image = image;
    }

    public DeploymentSpecTemplateSpecContainersImagePullPolicy getImagePullPolicy() {
        return imagePullPolicy;
    }

    public void setImagePullPolicy(final DeploymentSpecTemplateSpecContainersImagePullPolicy imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }

    public DeploymentSpecTemplateSpecContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final DeploymentSpecTemplateSpecContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public DeploymentSpecTemplateSpecContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final DeploymentSpecTemplateSpecContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<DeploymentSpecTemplateSpecContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<DeploymentSpecTemplateSpecContainersPorts> ports) {
        this.ports = ports;
    }

    public DeploymentSpecTemplateSpecContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final DeploymentSpecTemplateSpecContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public DeploymentSpecTemplateSpecContainersResources getResources() {
        return resources;
    }

    public void setResources(final DeploymentSpecTemplateSpecContainersResources resources) {
        this.resources = resources;
    }

    public DeploymentSpecTemplateSpecContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final DeploymentSpecTemplateSpecContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public DeploymentSpecTemplateSpecContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final DeploymentSpecTemplateSpecContainersStartupProbe startupProbe) {
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

    public String getTerminationMessagePath() {
        return terminationMessagePath;
    }

    public void setTerminationMessagePath(final String terminationMessagePath) {
        this.terminationMessagePath = terminationMessagePath;
    }

    public DeploymentSpecTemplateSpecContainersTerminationMessagePolicy getTerminationMessagePolicy() {
        return terminationMessagePolicy;
    }

    public void setTerminationMessagePolicy(final DeploymentSpecTemplateSpecContainersTerminationMessagePolicy terminationMessagePolicy) {
        this.terminationMessagePolicy = terminationMessagePolicy;
    }

    public Boolean getTty() {
        return tty;
    }

    public void setTty(final Boolean tty) {
        this.tty = tty;
    }

    public List<DeploymentSpecTemplateSpecContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<DeploymentSpecTemplateSpecContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<DeploymentSpecTemplateSpecContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<DeploymentSpecTemplateSpecContainersVolumeMounts> volumeMounts) {
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
                terminationMessagePath,
                terminationMessagePolicy,
                tty,
                volumeDevices,
                volumeMounts,
                workingDir);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentSpecTemplateSpecContainers)) {
            return false;
        }
        final DeploymentSpecTemplateSpecContainers __otherCasted = (DeploymentSpecTemplateSpecContainers) __other;
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
            Objects.equals(terminationMessagePath, __otherCasted.terminationMessagePath) &&
            Objects.equals(terminationMessagePolicy, __otherCasted.terminationMessagePolicy) &&
            Objects.equals(tty, __otherCasted.tty) &&
            Objects.equals(volumeDevices, __otherCasted.volumeDevices) &&
            Objects.equals(volumeMounts, __otherCasted.volumeMounts) &&
            Objects.equals(workingDir, __otherCasted.workingDir);
    }
}
