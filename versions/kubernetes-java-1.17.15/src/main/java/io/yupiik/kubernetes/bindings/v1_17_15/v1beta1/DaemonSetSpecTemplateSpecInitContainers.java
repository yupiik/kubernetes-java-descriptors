package io.yupiik.kubernetes.bindings.v1_17_15.v1beta1;

import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecInitContainers {
    private List<String> args;
    private List<String> command;
    private List<DaemonSetSpecTemplateSpecInitContainersEnv> env;
    private List<DaemonSetSpecTemplateSpecInitContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private DaemonSetSpecTemplateSpecInitContainersLifecycle lifecycle;
    private DaemonSetSpecTemplateSpecInitContainersLivenessProbe livenessProbe;
    private String name;
    private List<DaemonSetSpecTemplateSpecInitContainersPorts> ports;
    private DaemonSetSpecTemplateSpecInitContainersReadinessProbe readinessProbe;
    private DaemonSetSpecTemplateSpecInitContainersResources resources;
    private DaemonSetSpecTemplateSpecInitContainersSecurityContext securityContext;
    private DaemonSetSpecTemplateSpecInitContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<DaemonSetSpecTemplateSpecInitContainersVolumeDevices> volumeDevices;
    private List<DaemonSetSpecTemplateSpecInitContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public DaemonSetSpecTemplateSpecInitContainers() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecInitContainers(final List<String> args,
                                                   final List<String> command,
                                                   final List<DaemonSetSpecTemplateSpecInitContainersEnv> env,
                                                   final List<DaemonSetSpecTemplateSpecInitContainersEnvFrom> envFrom,
                                                   final String image,
                                                   final String imagePullPolicy,
                                                   final DaemonSetSpecTemplateSpecInitContainersLifecycle lifecycle,
                                                   final DaemonSetSpecTemplateSpecInitContainersLivenessProbe livenessProbe,
                                                   final String name,
                                                   final List<DaemonSetSpecTemplateSpecInitContainersPorts> ports,
                                                   final DaemonSetSpecTemplateSpecInitContainersReadinessProbe readinessProbe,
                                                   final DaemonSetSpecTemplateSpecInitContainersResources resources,
                                                   final DaemonSetSpecTemplateSpecInitContainersSecurityContext securityContext,
                                                   final DaemonSetSpecTemplateSpecInitContainersStartupProbe startupProbe,
                                                   final Boolean stdin,
                                                   final Boolean stdinOnce,
                                                   final String terminationMessagePath,
                                                   final String terminationMessagePolicy,
                                                   final Boolean tty,
                                                   final List<DaemonSetSpecTemplateSpecInitContainersVolumeDevices> volumeDevices,
                                                   final List<DaemonSetSpecTemplateSpecInitContainersVolumeMounts> volumeMounts,
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

    public List<DaemonSetSpecTemplateSpecInitContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<DaemonSetSpecTemplateSpecInitContainersEnv> env) {
        this.env = env;
    }

    public List<DaemonSetSpecTemplateSpecInitContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<DaemonSetSpecTemplateSpecInitContainersEnvFrom> envFrom) {
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

    public DaemonSetSpecTemplateSpecInitContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final DaemonSetSpecTemplateSpecInitContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public DaemonSetSpecTemplateSpecInitContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final DaemonSetSpecTemplateSpecInitContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<DaemonSetSpecTemplateSpecInitContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<DaemonSetSpecTemplateSpecInitContainersPorts> ports) {
        this.ports = ports;
    }

    public DaemonSetSpecTemplateSpecInitContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final DaemonSetSpecTemplateSpecInitContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public DaemonSetSpecTemplateSpecInitContainersResources getResources() {
        return resources;
    }

    public void setResources(final DaemonSetSpecTemplateSpecInitContainersResources resources) {
        this.resources = resources;
    }

    public DaemonSetSpecTemplateSpecInitContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final DaemonSetSpecTemplateSpecInitContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public DaemonSetSpecTemplateSpecInitContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final DaemonSetSpecTemplateSpecInitContainersStartupProbe startupProbe) {
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

    public List<DaemonSetSpecTemplateSpecInitContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<DaemonSetSpecTemplateSpecInitContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<DaemonSetSpecTemplateSpecInitContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<DaemonSetSpecTemplateSpecInitContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecInitContainers)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecInitContainers __otherCasted = (DaemonSetSpecTemplateSpecInitContainers) __other;
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
