package io.yupiik.kubernetes.bindings.v1_17_12;

import java.util.List;
import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecInitContainers {
    private List<String> args;
    private List<String> command;
    private List<ReplicaSetListItemsSpecTemplateSpecInitContainersEnv> env;
    private List<ReplicaSetListItemsSpecTemplateSpecInitContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private ReplicaSetListItemsSpecTemplateSpecInitContainersLifecycle lifecycle;
    private ReplicaSetListItemsSpecTemplateSpecInitContainersLivenessProbe livenessProbe;
    private String name;
    private List<ReplicaSetListItemsSpecTemplateSpecInitContainersPorts> ports;
    private ReplicaSetListItemsSpecTemplateSpecInitContainersReadinessProbe readinessProbe;
    private ReplicaSetListItemsSpecTemplateSpecInitContainersResources resources;
    private ReplicaSetListItemsSpecTemplateSpecInitContainersSecurityContext securityContext;
    private ReplicaSetListItemsSpecTemplateSpecInitContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<ReplicaSetListItemsSpecTemplateSpecInitContainersVolumeDevices> volumeDevices;
    private List<ReplicaSetListItemsSpecTemplateSpecInitContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public ReplicaSetListItemsSpecTemplateSpecInitContainers() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecInitContainers(final List<String> args,
                                                             final List<String> command,
                                                             final List<ReplicaSetListItemsSpecTemplateSpecInitContainersEnv> env,
                                                             final List<ReplicaSetListItemsSpecTemplateSpecInitContainersEnvFrom> envFrom,
                                                             final String image,
                                                             final String imagePullPolicy,
                                                             final ReplicaSetListItemsSpecTemplateSpecInitContainersLifecycle lifecycle,
                                                             final ReplicaSetListItemsSpecTemplateSpecInitContainersLivenessProbe livenessProbe,
                                                             final String name,
                                                             final List<ReplicaSetListItemsSpecTemplateSpecInitContainersPorts> ports,
                                                             final ReplicaSetListItemsSpecTemplateSpecInitContainersReadinessProbe readinessProbe,
                                                             final ReplicaSetListItemsSpecTemplateSpecInitContainersResources resources,
                                                             final ReplicaSetListItemsSpecTemplateSpecInitContainersSecurityContext securityContext,
                                                             final ReplicaSetListItemsSpecTemplateSpecInitContainersStartupProbe startupProbe,
                                                             final Boolean stdin,
                                                             final Boolean stdinOnce,
                                                             final String terminationMessagePath,
                                                             final String terminationMessagePolicy,
                                                             final Boolean tty,
                                                             final List<ReplicaSetListItemsSpecTemplateSpecInitContainersVolumeDevices> volumeDevices,
                                                             final List<ReplicaSetListItemsSpecTemplateSpecInitContainersVolumeMounts> volumeMounts,
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

    public List<ReplicaSetListItemsSpecTemplateSpecInitContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<ReplicaSetListItemsSpecTemplateSpecInitContainersEnv> env) {
        this.env = env;
    }

    public List<ReplicaSetListItemsSpecTemplateSpecInitContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<ReplicaSetListItemsSpecTemplateSpecInitContainersEnvFrom> envFrom) {
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

    public ReplicaSetListItemsSpecTemplateSpecInitContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final ReplicaSetListItemsSpecTemplateSpecInitContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public ReplicaSetListItemsSpecTemplateSpecInitContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final ReplicaSetListItemsSpecTemplateSpecInitContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<ReplicaSetListItemsSpecTemplateSpecInitContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<ReplicaSetListItemsSpecTemplateSpecInitContainersPorts> ports) {
        this.ports = ports;
    }

    public ReplicaSetListItemsSpecTemplateSpecInitContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final ReplicaSetListItemsSpecTemplateSpecInitContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public ReplicaSetListItemsSpecTemplateSpecInitContainersResources getResources() {
        return resources;
    }

    public void setResources(final ReplicaSetListItemsSpecTemplateSpecInitContainersResources resources) {
        this.resources = resources;
    }

    public ReplicaSetListItemsSpecTemplateSpecInitContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final ReplicaSetListItemsSpecTemplateSpecInitContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public ReplicaSetListItemsSpecTemplateSpecInitContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final ReplicaSetListItemsSpecTemplateSpecInitContainersStartupProbe startupProbe) {
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

    public List<ReplicaSetListItemsSpecTemplateSpecInitContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<ReplicaSetListItemsSpecTemplateSpecInitContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<ReplicaSetListItemsSpecTemplateSpecInitContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<ReplicaSetListItemsSpecTemplateSpecInitContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecInitContainers)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecInitContainers __otherCasted = (ReplicaSetListItemsSpecTemplateSpecInitContainers) __other;
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
