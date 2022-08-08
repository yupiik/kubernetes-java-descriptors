package io.yupiik.kubernetes.bindings.v1_16_3.v1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecInitContainers {
    private List<String> args;
    private List<String> command;
    private List<ReplicaSetSpecTemplateSpecInitContainersEnv> env;
    private List<ReplicaSetSpecTemplateSpecInitContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private ReplicaSetSpecTemplateSpecInitContainersLifecycle lifecycle;
    private ReplicaSetSpecTemplateSpecInitContainersLivenessProbe livenessProbe;
    private String name;
    private List<ReplicaSetSpecTemplateSpecInitContainersPorts> ports;
    private ReplicaSetSpecTemplateSpecInitContainersReadinessProbe readinessProbe;
    private ReplicaSetSpecTemplateSpecInitContainersResources resources;
    private ReplicaSetSpecTemplateSpecInitContainersSecurityContext securityContext;
    private ReplicaSetSpecTemplateSpecInitContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<ReplicaSetSpecTemplateSpecInitContainersVolumeDevices> volumeDevices;
    private List<ReplicaSetSpecTemplateSpecInitContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public ReplicaSetSpecTemplateSpecInitContainers() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecInitContainers(final List<String> args,
                                                    final List<String> command,
                                                    final List<ReplicaSetSpecTemplateSpecInitContainersEnv> env,
                                                    final List<ReplicaSetSpecTemplateSpecInitContainersEnvFrom> envFrom,
                                                    final String image,
                                                    final String imagePullPolicy,
                                                    final ReplicaSetSpecTemplateSpecInitContainersLifecycle lifecycle,
                                                    final ReplicaSetSpecTemplateSpecInitContainersLivenessProbe livenessProbe,
                                                    final String name,
                                                    final List<ReplicaSetSpecTemplateSpecInitContainersPorts> ports,
                                                    final ReplicaSetSpecTemplateSpecInitContainersReadinessProbe readinessProbe,
                                                    final ReplicaSetSpecTemplateSpecInitContainersResources resources,
                                                    final ReplicaSetSpecTemplateSpecInitContainersSecurityContext securityContext,
                                                    final ReplicaSetSpecTemplateSpecInitContainersStartupProbe startupProbe,
                                                    final Boolean stdin,
                                                    final Boolean stdinOnce,
                                                    final String terminationMessagePath,
                                                    final String terminationMessagePolicy,
                                                    final Boolean tty,
                                                    final List<ReplicaSetSpecTemplateSpecInitContainersVolumeDevices> volumeDevices,
                                                    final List<ReplicaSetSpecTemplateSpecInitContainersVolumeMounts> volumeMounts,
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

    public List<ReplicaSetSpecTemplateSpecInitContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<ReplicaSetSpecTemplateSpecInitContainersEnv> env) {
        this.env = env;
    }

    public List<ReplicaSetSpecTemplateSpecInitContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<ReplicaSetSpecTemplateSpecInitContainersEnvFrom> envFrom) {
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

    public ReplicaSetSpecTemplateSpecInitContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final ReplicaSetSpecTemplateSpecInitContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public ReplicaSetSpecTemplateSpecInitContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final ReplicaSetSpecTemplateSpecInitContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<ReplicaSetSpecTemplateSpecInitContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<ReplicaSetSpecTemplateSpecInitContainersPorts> ports) {
        this.ports = ports;
    }

    public ReplicaSetSpecTemplateSpecInitContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final ReplicaSetSpecTemplateSpecInitContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public ReplicaSetSpecTemplateSpecInitContainersResources getResources() {
        return resources;
    }

    public void setResources(final ReplicaSetSpecTemplateSpecInitContainersResources resources) {
        this.resources = resources;
    }

    public ReplicaSetSpecTemplateSpecInitContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final ReplicaSetSpecTemplateSpecInitContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public ReplicaSetSpecTemplateSpecInitContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final ReplicaSetSpecTemplateSpecInitContainersStartupProbe startupProbe) {
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

    public List<ReplicaSetSpecTemplateSpecInitContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<ReplicaSetSpecTemplateSpecInitContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<ReplicaSetSpecTemplateSpecInitContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<ReplicaSetSpecTemplateSpecInitContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecInitContainers)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecInitContainers __otherCasted = (ReplicaSetSpecTemplateSpecInitContainers) __other;
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
