package io.yupiik.kubernetes.bindings.v1_15_1.v1beta1;

import java.util.List;
import java.util.Objects;

public class DeploymentSpecTemplateSpecInitContainers {
    private List<String> args;
    private List<String> command;
    private List<DeploymentSpecTemplateSpecInitContainersEnv> env;
    private List<DeploymentSpecTemplateSpecInitContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private DeploymentSpecTemplateSpecInitContainersLifecycle lifecycle;
    private DeploymentSpecTemplateSpecInitContainersLivenessProbe livenessProbe;
    private String name;
    private List<DeploymentSpecTemplateSpecInitContainersPorts> ports;
    private DeploymentSpecTemplateSpecInitContainersReadinessProbe readinessProbe;
    private DeploymentSpecTemplateSpecInitContainersResources resources;
    private DeploymentSpecTemplateSpecInitContainersSecurityContext securityContext;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<DeploymentSpecTemplateSpecInitContainersVolumeDevices> volumeDevices;
    private List<DeploymentSpecTemplateSpecInitContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public DeploymentSpecTemplateSpecInitContainers() {
        // no-op
    }

    public DeploymentSpecTemplateSpecInitContainers(final List<String> args,
                                                    final List<String> command,
                                                    final List<DeploymentSpecTemplateSpecInitContainersEnv> env,
                                                    final List<DeploymentSpecTemplateSpecInitContainersEnvFrom> envFrom,
                                                    final String image,
                                                    final String imagePullPolicy,
                                                    final DeploymentSpecTemplateSpecInitContainersLifecycle lifecycle,
                                                    final DeploymentSpecTemplateSpecInitContainersLivenessProbe livenessProbe,
                                                    final String name,
                                                    final List<DeploymentSpecTemplateSpecInitContainersPorts> ports,
                                                    final DeploymentSpecTemplateSpecInitContainersReadinessProbe readinessProbe,
                                                    final DeploymentSpecTemplateSpecInitContainersResources resources,
                                                    final DeploymentSpecTemplateSpecInitContainersSecurityContext securityContext,
                                                    final Boolean stdin,
                                                    final Boolean stdinOnce,
                                                    final String terminationMessagePath,
                                                    final String terminationMessagePolicy,
                                                    final Boolean tty,
                                                    final List<DeploymentSpecTemplateSpecInitContainersVolumeDevices> volumeDevices,
                                                    final List<DeploymentSpecTemplateSpecInitContainersVolumeMounts> volumeMounts,
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

    public List<DeploymentSpecTemplateSpecInitContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<DeploymentSpecTemplateSpecInitContainersEnv> env) {
        this.env = env;
    }

    public List<DeploymentSpecTemplateSpecInitContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<DeploymentSpecTemplateSpecInitContainersEnvFrom> envFrom) {
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

    public DeploymentSpecTemplateSpecInitContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final DeploymentSpecTemplateSpecInitContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public DeploymentSpecTemplateSpecInitContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final DeploymentSpecTemplateSpecInitContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<DeploymentSpecTemplateSpecInitContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<DeploymentSpecTemplateSpecInitContainersPorts> ports) {
        this.ports = ports;
    }

    public DeploymentSpecTemplateSpecInitContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final DeploymentSpecTemplateSpecInitContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public DeploymentSpecTemplateSpecInitContainersResources getResources() {
        return resources;
    }

    public void setResources(final DeploymentSpecTemplateSpecInitContainersResources resources) {
        this.resources = resources;
    }

    public DeploymentSpecTemplateSpecInitContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final DeploymentSpecTemplateSpecInitContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
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

    public List<DeploymentSpecTemplateSpecInitContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<DeploymentSpecTemplateSpecInitContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<DeploymentSpecTemplateSpecInitContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<DeploymentSpecTemplateSpecInitContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecInitContainers)) {
            return false;
        }
        final DeploymentSpecTemplateSpecInitContainers __otherCasted = (DeploymentSpecTemplateSpecInitContainers) __other;
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
