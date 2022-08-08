package io.yupiik.kubernetes.bindings.v1_16_11.v1;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecEphemeralContainers {
    private List<String> args;
    private List<String> command;
    private List<DeploymentListItemsSpecTemplateSpecEphemeralContainersEnv> env;
    private List<DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecycle lifecycle;
    private DeploymentListItemsSpecTemplateSpecEphemeralContainersLivenessProbe livenessProbe;
    private String name;
    private List<DeploymentListItemsSpecTemplateSpecEphemeralContainersPorts> ports;
    private DeploymentListItemsSpecTemplateSpecEphemeralContainersReadinessProbe readinessProbe;
    private DeploymentListItemsSpecTemplateSpecEphemeralContainersResources resources;
    private DeploymentListItemsSpecTemplateSpecEphemeralContainersSecurityContext securityContext;
    private DeploymentListItemsSpecTemplateSpecEphemeralContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String targetContainerName;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<DeploymentListItemsSpecTemplateSpecEphemeralContainersVolumeDevices> volumeDevices;
    private List<DeploymentListItemsSpecTemplateSpecEphemeralContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public DeploymentListItemsSpecTemplateSpecEphemeralContainers() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainers(final List<String> args,
                                                                  final List<String> command,
                                                                  final List<DeploymentListItemsSpecTemplateSpecEphemeralContainersEnv> env,
                                                                  final List<DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvFrom> envFrom,
                                                                  final String image,
                                                                  final String imagePullPolicy,
                                                                  final DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecycle lifecycle,
                                                                  final DeploymentListItemsSpecTemplateSpecEphemeralContainersLivenessProbe livenessProbe,
                                                                  final String name,
                                                                  final List<DeploymentListItemsSpecTemplateSpecEphemeralContainersPorts> ports,
                                                                  final DeploymentListItemsSpecTemplateSpecEphemeralContainersReadinessProbe readinessProbe,
                                                                  final DeploymentListItemsSpecTemplateSpecEphemeralContainersResources resources,
                                                                  final DeploymentListItemsSpecTemplateSpecEphemeralContainersSecurityContext securityContext,
                                                                  final DeploymentListItemsSpecTemplateSpecEphemeralContainersStartupProbe startupProbe,
                                                                  final Boolean stdin,
                                                                  final Boolean stdinOnce,
                                                                  final String targetContainerName,
                                                                  final String terminationMessagePath,
                                                                  final String terminationMessagePolicy,
                                                                  final Boolean tty,
                                                                  final List<DeploymentListItemsSpecTemplateSpecEphemeralContainersVolumeDevices> volumeDevices,
                                                                  final List<DeploymentListItemsSpecTemplateSpecEphemeralContainersVolumeMounts> volumeMounts,
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

    public List<DeploymentListItemsSpecTemplateSpecEphemeralContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<DeploymentListItemsSpecTemplateSpecEphemeralContainersEnv> env) {
        this.env = env;
    }

    public List<DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvFrom> envFrom) {
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

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final DeploymentListItemsSpecTemplateSpecEphemeralContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final DeploymentListItemsSpecTemplateSpecEphemeralContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<DeploymentListItemsSpecTemplateSpecEphemeralContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<DeploymentListItemsSpecTemplateSpecEphemeralContainersPorts> ports) {
        this.ports = ports;
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final DeploymentListItemsSpecTemplateSpecEphemeralContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersResources getResources() {
        return resources;
    }

    public void setResources(final DeploymentListItemsSpecTemplateSpecEphemeralContainersResources resources) {
        this.resources = resources;
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final DeploymentListItemsSpecTemplateSpecEphemeralContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final DeploymentListItemsSpecTemplateSpecEphemeralContainersStartupProbe startupProbe) {
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

    public List<DeploymentListItemsSpecTemplateSpecEphemeralContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<DeploymentListItemsSpecTemplateSpecEphemeralContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<DeploymentListItemsSpecTemplateSpecEphemeralContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<DeploymentListItemsSpecTemplateSpecEphemeralContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecEphemeralContainers)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecEphemeralContainers __otherCasted = (DeploymentListItemsSpecTemplateSpecEphemeralContainers) __other;
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
