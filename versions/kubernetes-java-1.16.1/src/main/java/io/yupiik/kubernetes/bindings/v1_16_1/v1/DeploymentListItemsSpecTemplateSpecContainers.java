package io.yupiik.kubernetes.bindings.v1_16_1.v1;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecContainers {
    private List<String> args;
    private List<String> command;
    private List<DeploymentListItemsSpecTemplateSpecContainersEnv> env;
    private List<DeploymentListItemsSpecTemplateSpecContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private DeploymentListItemsSpecTemplateSpecContainersLifecycle lifecycle;
    private DeploymentListItemsSpecTemplateSpecContainersLivenessProbe livenessProbe;
    private String name;
    private List<DeploymentListItemsSpecTemplateSpecContainersPorts> ports;
    private DeploymentListItemsSpecTemplateSpecContainersReadinessProbe readinessProbe;
    private DeploymentListItemsSpecTemplateSpecContainersResources resources;
    private DeploymentListItemsSpecTemplateSpecContainersSecurityContext securityContext;
    private DeploymentListItemsSpecTemplateSpecContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<DeploymentListItemsSpecTemplateSpecContainersVolumeDevices> volumeDevices;
    private List<DeploymentListItemsSpecTemplateSpecContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public DeploymentListItemsSpecTemplateSpecContainers() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecContainers(final List<String> args,
                                                         final List<String> command,
                                                         final List<DeploymentListItemsSpecTemplateSpecContainersEnv> env,
                                                         final List<DeploymentListItemsSpecTemplateSpecContainersEnvFrom> envFrom,
                                                         final String image,
                                                         final String imagePullPolicy,
                                                         final DeploymentListItemsSpecTemplateSpecContainersLifecycle lifecycle,
                                                         final DeploymentListItemsSpecTemplateSpecContainersLivenessProbe livenessProbe,
                                                         final String name,
                                                         final List<DeploymentListItemsSpecTemplateSpecContainersPorts> ports,
                                                         final DeploymentListItemsSpecTemplateSpecContainersReadinessProbe readinessProbe,
                                                         final DeploymentListItemsSpecTemplateSpecContainersResources resources,
                                                         final DeploymentListItemsSpecTemplateSpecContainersSecurityContext securityContext,
                                                         final DeploymentListItemsSpecTemplateSpecContainersStartupProbe startupProbe,
                                                         final Boolean stdin,
                                                         final Boolean stdinOnce,
                                                         final String terminationMessagePath,
                                                         final String terminationMessagePolicy,
                                                         final Boolean tty,
                                                         final List<DeploymentListItemsSpecTemplateSpecContainersVolumeDevices> volumeDevices,
                                                         final List<DeploymentListItemsSpecTemplateSpecContainersVolumeMounts> volumeMounts,
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

    public List<DeploymentListItemsSpecTemplateSpecContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<DeploymentListItemsSpecTemplateSpecContainersEnv> env) {
        this.env = env;
    }

    public List<DeploymentListItemsSpecTemplateSpecContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<DeploymentListItemsSpecTemplateSpecContainersEnvFrom> envFrom) {
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

    public DeploymentListItemsSpecTemplateSpecContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final DeploymentListItemsSpecTemplateSpecContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public DeploymentListItemsSpecTemplateSpecContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final DeploymentListItemsSpecTemplateSpecContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<DeploymentListItemsSpecTemplateSpecContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<DeploymentListItemsSpecTemplateSpecContainersPorts> ports) {
        this.ports = ports;
    }

    public DeploymentListItemsSpecTemplateSpecContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final DeploymentListItemsSpecTemplateSpecContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public DeploymentListItemsSpecTemplateSpecContainersResources getResources() {
        return resources;
    }

    public void setResources(final DeploymentListItemsSpecTemplateSpecContainersResources resources) {
        this.resources = resources;
    }

    public DeploymentListItemsSpecTemplateSpecContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final DeploymentListItemsSpecTemplateSpecContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public DeploymentListItemsSpecTemplateSpecContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final DeploymentListItemsSpecTemplateSpecContainersStartupProbe startupProbe) {
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

    public List<DeploymentListItemsSpecTemplateSpecContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<DeploymentListItemsSpecTemplateSpecContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<DeploymentListItemsSpecTemplateSpecContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<DeploymentListItemsSpecTemplateSpecContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecContainers)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecContainers __otherCasted = (DeploymentListItemsSpecTemplateSpecContainers) __other;
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
