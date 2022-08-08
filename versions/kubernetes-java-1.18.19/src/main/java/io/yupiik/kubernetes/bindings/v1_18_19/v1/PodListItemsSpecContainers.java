package io.yupiik.kubernetes.bindings.v1_18_19.v1;

import java.util.List;
import java.util.Objects;

public class PodListItemsSpecContainers {
    private List<String> args;
    private List<String> command;
    private List<PodListItemsSpecContainersEnv> env;
    private List<PodListItemsSpecContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private PodListItemsSpecContainersLifecycle lifecycle;
    private PodListItemsSpecContainersLivenessProbe livenessProbe;
    private String name;
    private List<PodListItemsSpecContainersPorts> ports;
    private PodListItemsSpecContainersReadinessProbe readinessProbe;
    private PodListItemsSpecContainersResources resources;
    private PodListItemsSpecContainersSecurityContext securityContext;
    private PodListItemsSpecContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<PodListItemsSpecContainersVolumeDevices> volumeDevices;
    private List<PodListItemsSpecContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public PodListItemsSpecContainers() {
        // no-op
    }

    public PodListItemsSpecContainers(final List<String> args,
                                      final List<String> command,
                                      final List<PodListItemsSpecContainersEnv> env,
                                      final List<PodListItemsSpecContainersEnvFrom> envFrom,
                                      final String image,
                                      final String imagePullPolicy,
                                      final PodListItemsSpecContainersLifecycle lifecycle,
                                      final PodListItemsSpecContainersLivenessProbe livenessProbe,
                                      final String name,
                                      final List<PodListItemsSpecContainersPorts> ports,
                                      final PodListItemsSpecContainersReadinessProbe readinessProbe,
                                      final PodListItemsSpecContainersResources resources,
                                      final PodListItemsSpecContainersSecurityContext securityContext,
                                      final PodListItemsSpecContainersStartupProbe startupProbe,
                                      final Boolean stdin,
                                      final Boolean stdinOnce,
                                      final String terminationMessagePath,
                                      final String terminationMessagePolicy,
                                      final Boolean tty,
                                      final List<PodListItemsSpecContainersVolumeDevices> volumeDevices,
                                      final List<PodListItemsSpecContainersVolumeMounts> volumeMounts,
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

    public List<PodListItemsSpecContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<PodListItemsSpecContainersEnv> env) {
        this.env = env;
    }

    public List<PodListItemsSpecContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<PodListItemsSpecContainersEnvFrom> envFrom) {
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

    public PodListItemsSpecContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final PodListItemsSpecContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public PodListItemsSpecContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final PodListItemsSpecContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<PodListItemsSpecContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<PodListItemsSpecContainersPorts> ports) {
        this.ports = ports;
    }

    public PodListItemsSpecContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final PodListItemsSpecContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public PodListItemsSpecContainersResources getResources() {
        return resources;
    }

    public void setResources(final PodListItemsSpecContainersResources resources) {
        this.resources = resources;
    }

    public PodListItemsSpecContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final PodListItemsSpecContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public PodListItemsSpecContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final PodListItemsSpecContainersStartupProbe startupProbe) {
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

    public List<PodListItemsSpecContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<PodListItemsSpecContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<PodListItemsSpecContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<PodListItemsSpecContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof PodListItemsSpecContainers)) {
            return false;
        }
        final PodListItemsSpecContainers __otherCasted = (PodListItemsSpecContainers) __other;
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
