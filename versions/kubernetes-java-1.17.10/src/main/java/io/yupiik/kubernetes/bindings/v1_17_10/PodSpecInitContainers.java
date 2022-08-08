package io.yupiik.kubernetes.bindings.v1_17_10;

import java.util.List;
import java.util.Objects;

public class PodSpecInitContainers {
    private List<String> args;
    private List<String> command;
    private List<PodSpecInitContainersEnv> env;
    private List<PodSpecInitContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private PodSpecInitContainersLifecycle lifecycle;
    private PodSpecInitContainersLivenessProbe livenessProbe;
    private String name;
    private List<PodSpecInitContainersPorts> ports;
    private PodSpecInitContainersReadinessProbe readinessProbe;
    private PodSpecInitContainersResources resources;
    private PodSpecInitContainersSecurityContext securityContext;
    private PodSpecInitContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<PodSpecInitContainersVolumeDevices> volumeDevices;
    private List<PodSpecInitContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public PodSpecInitContainers() {
        // no-op
    }

    public PodSpecInitContainers(final List<String> args,
                                 final List<String> command,
                                 final List<PodSpecInitContainersEnv> env,
                                 final List<PodSpecInitContainersEnvFrom> envFrom,
                                 final String image,
                                 final String imagePullPolicy,
                                 final PodSpecInitContainersLifecycle lifecycle,
                                 final PodSpecInitContainersLivenessProbe livenessProbe,
                                 final String name,
                                 final List<PodSpecInitContainersPorts> ports,
                                 final PodSpecInitContainersReadinessProbe readinessProbe,
                                 final PodSpecInitContainersResources resources,
                                 final PodSpecInitContainersSecurityContext securityContext,
                                 final PodSpecInitContainersStartupProbe startupProbe,
                                 final Boolean stdin,
                                 final Boolean stdinOnce,
                                 final String terminationMessagePath,
                                 final String terminationMessagePolicy,
                                 final Boolean tty,
                                 final List<PodSpecInitContainersVolumeDevices> volumeDevices,
                                 final List<PodSpecInitContainersVolumeMounts> volumeMounts,
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

    public List<PodSpecInitContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<PodSpecInitContainersEnv> env) {
        this.env = env;
    }

    public List<PodSpecInitContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<PodSpecInitContainersEnvFrom> envFrom) {
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

    public PodSpecInitContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final PodSpecInitContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public PodSpecInitContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final PodSpecInitContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<PodSpecInitContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<PodSpecInitContainersPorts> ports) {
        this.ports = ports;
    }

    public PodSpecInitContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final PodSpecInitContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public PodSpecInitContainersResources getResources() {
        return resources;
    }

    public void setResources(final PodSpecInitContainersResources resources) {
        this.resources = resources;
    }

    public PodSpecInitContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final PodSpecInitContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public PodSpecInitContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final PodSpecInitContainersStartupProbe startupProbe) {
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

    public List<PodSpecInitContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<PodSpecInitContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<PodSpecInitContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<PodSpecInitContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof PodSpecInitContainers)) {
            return false;
        }
        final PodSpecInitContainers __otherCasted = (PodSpecInitContainers) __other;
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
