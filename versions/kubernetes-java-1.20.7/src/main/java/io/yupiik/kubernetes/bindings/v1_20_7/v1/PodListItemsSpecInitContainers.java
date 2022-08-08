package io.yupiik.kubernetes.bindings.v1_20_7.v1;

import java.util.List;
import java.util.Objects;

public class PodListItemsSpecInitContainers {
    private List<String> args;
    private List<String> command;
    private List<PodListItemsSpecInitContainersEnv> env;
    private List<PodListItemsSpecInitContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private PodListItemsSpecInitContainersLifecycle lifecycle;
    private PodListItemsSpecInitContainersLivenessProbe livenessProbe;
    private String name;
    private List<PodListItemsSpecInitContainersPorts> ports;
    private PodListItemsSpecInitContainersReadinessProbe readinessProbe;
    private PodListItemsSpecInitContainersResources resources;
    private PodListItemsSpecInitContainersSecurityContext securityContext;
    private PodListItemsSpecInitContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<PodListItemsSpecInitContainersVolumeDevices> volumeDevices;
    private List<PodListItemsSpecInitContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public PodListItemsSpecInitContainers() {
        // no-op
    }

    public PodListItemsSpecInitContainers(final List<String> args,
                                          final List<String> command,
                                          final List<PodListItemsSpecInitContainersEnv> env,
                                          final List<PodListItemsSpecInitContainersEnvFrom> envFrom,
                                          final String image,
                                          final String imagePullPolicy,
                                          final PodListItemsSpecInitContainersLifecycle lifecycle,
                                          final PodListItemsSpecInitContainersLivenessProbe livenessProbe,
                                          final String name,
                                          final List<PodListItemsSpecInitContainersPorts> ports,
                                          final PodListItemsSpecInitContainersReadinessProbe readinessProbe,
                                          final PodListItemsSpecInitContainersResources resources,
                                          final PodListItemsSpecInitContainersSecurityContext securityContext,
                                          final PodListItemsSpecInitContainersStartupProbe startupProbe,
                                          final Boolean stdin,
                                          final Boolean stdinOnce,
                                          final String terminationMessagePath,
                                          final String terminationMessagePolicy,
                                          final Boolean tty,
                                          final List<PodListItemsSpecInitContainersVolumeDevices> volumeDevices,
                                          final List<PodListItemsSpecInitContainersVolumeMounts> volumeMounts,
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

    public List<PodListItemsSpecInitContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<PodListItemsSpecInitContainersEnv> env) {
        this.env = env;
    }

    public List<PodListItemsSpecInitContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<PodListItemsSpecInitContainersEnvFrom> envFrom) {
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

    public PodListItemsSpecInitContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final PodListItemsSpecInitContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public PodListItemsSpecInitContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final PodListItemsSpecInitContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<PodListItemsSpecInitContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<PodListItemsSpecInitContainersPorts> ports) {
        this.ports = ports;
    }

    public PodListItemsSpecInitContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final PodListItemsSpecInitContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public PodListItemsSpecInitContainersResources getResources() {
        return resources;
    }

    public void setResources(final PodListItemsSpecInitContainersResources resources) {
        this.resources = resources;
    }

    public PodListItemsSpecInitContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final PodListItemsSpecInitContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public PodListItemsSpecInitContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final PodListItemsSpecInitContainersStartupProbe startupProbe) {
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

    public List<PodListItemsSpecInitContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<PodListItemsSpecInitContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<PodListItemsSpecInitContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<PodListItemsSpecInitContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof PodListItemsSpecInitContainers)) {
            return false;
        }
        final PodListItemsSpecInitContainers __otherCasted = (PodListItemsSpecInitContainers) __other;
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
