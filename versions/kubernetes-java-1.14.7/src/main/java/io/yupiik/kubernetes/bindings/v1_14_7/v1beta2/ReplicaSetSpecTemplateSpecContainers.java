package io.yupiik.kubernetes.bindings.v1_14_7.v1beta2;

import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecContainers {
    private List<String> args;
    private List<String> command;
    private List<ReplicaSetSpecTemplateSpecContainersEnv> env;
    private List<ReplicaSetSpecTemplateSpecContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private ReplicaSetSpecTemplateSpecContainersLifecycle lifecycle;
    private ReplicaSetSpecTemplateSpecContainersLivenessProbe livenessProbe;
    private String name;
    private List<ReplicaSetSpecTemplateSpecContainersPorts> ports;
    private ReplicaSetSpecTemplateSpecContainersReadinessProbe readinessProbe;
    private ReplicaSetSpecTemplateSpecContainersResources resources;
    private ReplicaSetSpecTemplateSpecContainersSecurityContext securityContext;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<ReplicaSetSpecTemplateSpecContainersVolumeDevices> volumeDevices;
    private List<ReplicaSetSpecTemplateSpecContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public ReplicaSetSpecTemplateSpecContainers() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecContainers(final List<String> args,
                                                final List<String> command,
                                                final List<ReplicaSetSpecTemplateSpecContainersEnv> env,
                                                final List<ReplicaSetSpecTemplateSpecContainersEnvFrom> envFrom,
                                                final String image,
                                                final String imagePullPolicy,
                                                final ReplicaSetSpecTemplateSpecContainersLifecycle lifecycle,
                                                final ReplicaSetSpecTemplateSpecContainersLivenessProbe livenessProbe,
                                                final String name,
                                                final List<ReplicaSetSpecTemplateSpecContainersPorts> ports,
                                                final ReplicaSetSpecTemplateSpecContainersReadinessProbe readinessProbe,
                                                final ReplicaSetSpecTemplateSpecContainersResources resources,
                                                final ReplicaSetSpecTemplateSpecContainersSecurityContext securityContext,
                                                final Boolean stdin,
                                                final Boolean stdinOnce,
                                                final String terminationMessagePath,
                                                final String terminationMessagePolicy,
                                                final Boolean tty,
                                                final List<ReplicaSetSpecTemplateSpecContainersVolumeDevices> volumeDevices,
                                                final List<ReplicaSetSpecTemplateSpecContainersVolumeMounts> volumeMounts,
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

    public List<ReplicaSetSpecTemplateSpecContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<ReplicaSetSpecTemplateSpecContainersEnv> env) {
        this.env = env;
    }

    public List<ReplicaSetSpecTemplateSpecContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<ReplicaSetSpecTemplateSpecContainersEnvFrom> envFrom) {
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

    public ReplicaSetSpecTemplateSpecContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final ReplicaSetSpecTemplateSpecContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public ReplicaSetSpecTemplateSpecContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final ReplicaSetSpecTemplateSpecContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<ReplicaSetSpecTemplateSpecContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<ReplicaSetSpecTemplateSpecContainersPorts> ports) {
        this.ports = ports;
    }

    public ReplicaSetSpecTemplateSpecContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final ReplicaSetSpecTemplateSpecContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public ReplicaSetSpecTemplateSpecContainersResources getResources() {
        return resources;
    }

    public void setResources(final ReplicaSetSpecTemplateSpecContainersResources resources) {
        this.resources = resources;
    }

    public ReplicaSetSpecTemplateSpecContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final ReplicaSetSpecTemplateSpecContainersSecurityContext securityContext) {
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

    public List<ReplicaSetSpecTemplateSpecContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<ReplicaSetSpecTemplateSpecContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<ReplicaSetSpecTemplateSpecContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<ReplicaSetSpecTemplateSpecContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecContainers)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecContainers __otherCasted = (ReplicaSetSpecTemplateSpecContainers) __other;
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
