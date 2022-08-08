package io.yupiik.kubernetes.bindings.v1_15_11.v1beta1;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecInitContainers {
    private List<String> args;
    private List<String> command;
    private List<DaemonSetListItemsSpecTemplateSpecInitContainersEnv> env;
    private List<DaemonSetListItemsSpecTemplateSpecInitContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private DaemonSetListItemsSpecTemplateSpecInitContainersLifecycle lifecycle;
    private DaemonSetListItemsSpecTemplateSpecInitContainersLivenessProbe livenessProbe;
    private String name;
    private List<DaemonSetListItemsSpecTemplateSpecInitContainersPorts> ports;
    private DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbe readinessProbe;
    private DaemonSetListItemsSpecTemplateSpecInitContainersResources resources;
    private DaemonSetListItemsSpecTemplateSpecInitContainersSecurityContext securityContext;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<DaemonSetListItemsSpecTemplateSpecInitContainersVolumeDevices> volumeDevices;
    private List<DaemonSetListItemsSpecTemplateSpecInitContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public DaemonSetListItemsSpecTemplateSpecInitContainers() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainers(final List<String> args,
                                                            final List<String> command,
                                                            final List<DaemonSetListItemsSpecTemplateSpecInitContainersEnv> env,
                                                            final List<DaemonSetListItemsSpecTemplateSpecInitContainersEnvFrom> envFrom,
                                                            final String image,
                                                            final String imagePullPolicy,
                                                            final DaemonSetListItemsSpecTemplateSpecInitContainersLifecycle lifecycle,
                                                            final DaemonSetListItemsSpecTemplateSpecInitContainersLivenessProbe livenessProbe,
                                                            final String name,
                                                            final List<DaemonSetListItemsSpecTemplateSpecInitContainersPorts> ports,
                                                            final DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbe readinessProbe,
                                                            final DaemonSetListItemsSpecTemplateSpecInitContainersResources resources,
                                                            final DaemonSetListItemsSpecTemplateSpecInitContainersSecurityContext securityContext,
                                                            final Boolean stdin,
                                                            final Boolean stdinOnce,
                                                            final String terminationMessagePath,
                                                            final String terminationMessagePolicy,
                                                            final Boolean tty,
                                                            final List<DaemonSetListItemsSpecTemplateSpecInitContainersVolumeDevices> volumeDevices,
                                                            final List<DaemonSetListItemsSpecTemplateSpecInitContainersVolumeMounts> volumeMounts,
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

    public List<DaemonSetListItemsSpecTemplateSpecInitContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<DaemonSetListItemsSpecTemplateSpecInitContainersEnv> env) {
        this.env = env;
    }

    public List<DaemonSetListItemsSpecTemplateSpecInitContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<DaemonSetListItemsSpecTemplateSpecInitContainersEnvFrom> envFrom) {
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

    public DaemonSetListItemsSpecTemplateSpecInitContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final DaemonSetListItemsSpecTemplateSpecInitContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final DaemonSetListItemsSpecTemplateSpecInitContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<DaemonSetListItemsSpecTemplateSpecInitContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<DaemonSetListItemsSpecTemplateSpecInitContainersPorts> ports) {
        this.ports = ports;
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersResources getResources() {
        return resources;
    }

    public void setResources(final DaemonSetListItemsSpecTemplateSpecInitContainersResources resources) {
        this.resources = resources;
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final DaemonSetListItemsSpecTemplateSpecInitContainersSecurityContext securityContext) {
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

    public List<DaemonSetListItemsSpecTemplateSpecInitContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<DaemonSetListItemsSpecTemplateSpecInitContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<DaemonSetListItemsSpecTemplateSpecInitContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<DaemonSetListItemsSpecTemplateSpecInitContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecInitContainers)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecInitContainers __otherCasted = (DaemonSetListItemsSpecTemplateSpecInitContainers) __other;
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
