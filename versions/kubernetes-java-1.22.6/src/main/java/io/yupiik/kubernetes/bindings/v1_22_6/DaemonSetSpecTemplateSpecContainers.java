package io.yupiik.kubernetes.bindings.v1_22_6;

import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecContainers {
    private List<String> args;
    private List<String> command;
    private List<DaemonSetSpecTemplateSpecContainersEnv> env;
    private List<DaemonSetSpecTemplateSpecContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private DaemonSetSpecTemplateSpecContainersLifecycle lifecycle;
    private DaemonSetSpecTemplateSpecContainersLivenessProbe livenessProbe;
    private String name;
    private List<DaemonSetSpecTemplateSpecContainersPorts> ports;
    private DaemonSetSpecTemplateSpecContainersReadinessProbe readinessProbe;
    private DaemonSetSpecTemplateSpecContainersResources resources;
    private DaemonSetSpecTemplateSpecContainersSecurityContext securityContext;
    private DaemonSetSpecTemplateSpecContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<DaemonSetSpecTemplateSpecContainersVolumeDevices> volumeDevices;
    private List<DaemonSetSpecTemplateSpecContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public DaemonSetSpecTemplateSpecContainers() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecContainers(final List<String> args,
                                               final List<String> command,
                                               final List<DaemonSetSpecTemplateSpecContainersEnv> env,
                                               final List<DaemonSetSpecTemplateSpecContainersEnvFrom> envFrom,
                                               final String image,
                                               final String imagePullPolicy,
                                               final DaemonSetSpecTemplateSpecContainersLifecycle lifecycle,
                                               final DaemonSetSpecTemplateSpecContainersLivenessProbe livenessProbe,
                                               final String name,
                                               final List<DaemonSetSpecTemplateSpecContainersPorts> ports,
                                               final DaemonSetSpecTemplateSpecContainersReadinessProbe readinessProbe,
                                               final DaemonSetSpecTemplateSpecContainersResources resources,
                                               final DaemonSetSpecTemplateSpecContainersSecurityContext securityContext,
                                               final DaemonSetSpecTemplateSpecContainersStartupProbe startupProbe,
                                               final Boolean stdin,
                                               final Boolean stdinOnce,
                                               final String terminationMessagePath,
                                               final String terminationMessagePolicy,
                                               final Boolean tty,
                                               final List<DaemonSetSpecTemplateSpecContainersVolumeDevices> volumeDevices,
                                               final List<DaemonSetSpecTemplateSpecContainersVolumeMounts> volumeMounts,
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

    public List<DaemonSetSpecTemplateSpecContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<DaemonSetSpecTemplateSpecContainersEnv> env) {
        this.env = env;
    }

    public List<DaemonSetSpecTemplateSpecContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<DaemonSetSpecTemplateSpecContainersEnvFrom> envFrom) {
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

    public DaemonSetSpecTemplateSpecContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final DaemonSetSpecTemplateSpecContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public DaemonSetSpecTemplateSpecContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final DaemonSetSpecTemplateSpecContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<DaemonSetSpecTemplateSpecContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<DaemonSetSpecTemplateSpecContainersPorts> ports) {
        this.ports = ports;
    }

    public DaemonSetSpecTemplateSpecContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final DaemonSetSpecTemplateSpecContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public DaemonSetSpecTemplateSpecContainersResources getResources() {
        return resources;
    }

    public void setResources(final DaemonSetSpecTemplateSpecContainersResources resources) {
        this.resources = resources;
    }

    public DaemonSetSpecTemplateSpecContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final DaemonSetSpecTemplateSpecContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public DaemonSetSpecTemplateSpecContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final DaemonSetSpecTemplateSpecContainersStartupProbe startupProbe) {
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

    public List<DaemonSetSpecTemplateSpecContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<DaemonSetSpecTemplateSpecContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<DaemonSetSpecTemplateSpecContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<DaemonSetSpecTemplateSpecContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecContainers)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecContainers __otherCasted = (DaemonSetSpecTemplateSpecContainers) __other;
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
