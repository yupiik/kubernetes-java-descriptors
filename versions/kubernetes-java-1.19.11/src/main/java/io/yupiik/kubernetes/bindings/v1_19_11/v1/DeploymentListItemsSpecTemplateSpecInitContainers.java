package io.yupiik.kubernetes.bindings.v1_19_11.v1;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecInitContainers {
    private List<String> args;
    private List<String> command;
    private List<DeploymentListItemsSpecTemplateSpecInitContainersEnv> env;
    private List<DeploymentListItemsSpecTemplateSpecInitContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private DeploymentListItemsSpecTemplateSpecInitContainersLifecycle lifecycle;
    private DeploymentListItemsSpecTemplateSpecInitContainersLivenessProbe livenessProbe;
    private String name;
    private List<DeploymentListItemsSpecTemplateSpecInitContainersPorts> ports;
    private DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbe readinessProbe;
    private DeploymentListItemsSpecTemplateSpecInitContainersResources resources;
    private DeploymentListItemsSpecTemplateSpecInitContainersSecurityContext securityContext;
    private DeploymentListItemsSpecTemplateSpecInitContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<DeploymentListItemsSpecTemplateSpecInitContainersVolumeDevices> volumeDevices;
    private List<DeploymentListItemsSpecTemplateSpecInitContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public DeploymentListItemsSpecTemplateSpecInitContainers() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecInitContainers(final List<String> args,
                                                             final List<String> command,
                                                             final List<DeploymentListItemsSpecTemplateSpecInitContainersEnv> env,
                                                             final List<DeploymentListItemsSpecTemplateSpecInitContainersEnvFrom> envFrom,
                                                             final String image,
                                                             final String imagePullPolicy,
                                                             final DeploymentListItemsSpecTemplateSpecInitContainersLifecycle lifecycle,
                                                             final DeploymentListItemsSpecTemplateSpecInitContainersLivenessProbe livenessProbe,
                                                             final String name,
                                                             final List<DeploymentListItemsSpecTemplateSpecInitContainersPorts> ports,
                                                             final DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbe readinessProbe,
                                                             final DeploymentListItemsSpecTemplateSpecInitContainersResources resources,
                                                             final DeploymentListItemsSpecTemplateSpecInitContainersSecurityContext securityContext,
                                                             final DeploymentListItemsSpecTemplateSpecInitContainersStartupProbe startupProbe,
                                                             final Boolean stdin,
                                                             final Boolean stdinOnce,
                                                             final String terminationMessagePath,
                                                             final String terminationMessagePolicy,
                                                             final Boolean tty,
                                                             final List<DeploymentListItemsSpecTemplateSpecInitContainersVolumeDevices> volumeDevices,
                                                             final List<DeploymentListItemsSpecTemplateSpecInitContainersVolumeMounts> volumeMounts,
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

    public List<DeploymentListItemsSpecTemplateSpecInitContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<DeploymentListItemsSpecTemplateSpecInitContainersEnv> env) {
        this.env = env;
    }

    public List<DeploymentListItemsSpecTemplateSpecInitContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<DeploymentListItemsSpecTemplateSpecInitContainersEnvFrom> envFrom) {
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

    public DeploymentListItemsSpecTemplateSpecInitContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final DeploymentListItemsSpecTemplateSpecInitContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final DeploymentListItemsSpecTemplateSpecInitContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<DeploymentListItemsSpecTemplateSpecInitContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<DeploymentListItemsSpecTemplateSpecInitContainersPorts> ports) {
        this.ports = ports;
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final DeploymentListItemsSpecTemplateSpecInitContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersResources getResources() {
        return resources;
    }

    public void setResources(final DeploymentListItemsSpecTemplateSpecInitContainersResources resources) {
        this.resources = resources;
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final DeploymentListItemsSpecTemplateSpecInitContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final DeploymentListItemsSpecTemplateSpecInitContainersStartupProbe startupProbe) {
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

    public List<DeploymentListItemsSpecTemplateSpecInitContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<DeploymentListItemsSpecTemplateSpecInitContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<DeploymentListItemsSpecTemplateSpecInitContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<DeploymentListItemsSpecTemplateSpecInitContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecInitContainers)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecInitContainers __otherCasted = (DeploymentListItemsSpecTemplateSpecInitContainers) __other;
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
