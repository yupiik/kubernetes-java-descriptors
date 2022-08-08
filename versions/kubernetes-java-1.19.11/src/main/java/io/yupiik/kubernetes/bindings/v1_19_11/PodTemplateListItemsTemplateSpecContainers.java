package io.yupiik.kubernetes.bindings.v1_19_11;

import java.util.List;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecContainers {
    private List<String> args;
    private List<String> command;
    private List<PodTemplateListItemsTemplateSpecContainersEnv> env;
    private List<PodTemplateListItemsTemplateSpecContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private PodTemplateListItemsTemplateSpecContainersLifecycle lifecycle;
    private PodTemplateListItemsTemplateSpecContainersLivenessProbe livenessProbe;
    private String name;
    private List<PodTemplateListItemsTemplateSpecContainersPorts> ports;
    private PodTemplateListItemsTemplateSpecContainersReadinessProbe readinessProbe;
    private PodTemplateListItemsTemplateSpecContainersResources resources;
    private PodTemplateListItemsTemplateSpecContainersSecurityContext securityContext;
    private PodTemplateListItemsTemplateSpecContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<PodTemplateListItemsTemplateSpecContainersVolumeDevices> volumeDevices;
    private List<PodTemplateListItemsTemplateSpecContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public PodTemplateListItemsTemplateSpecContainers() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecContainers(final List<String> args,
                                                      final List<String> command,
                                                      final List<PodTemplateListItemsTemplateSpecContainersEnv> env,
                                                      final List<PodTemplateListItemsTemplateSpecContainersEnvFrom> envFrom,
                                                      final String image,
                                                      final String imagePullPolicy,
                                                      final PodTemplateListItemsTemplateSpecContainersLifecycle lifecycle,
                                                      final PodTemplateListItemsTemplateSpecContainersLivenessProbe livenessProbe,
                                                      final String name,
                                                      final List<PodTemplateListItemsTemplateSpecContainersPorts> ports,
                                                      final PodTemplateListItemsTemplateSpecContainersReadinessProbe readinessProbe,
                                                      final PodTemplateListItemsTemplateSpecContainersResources resources,
                                                      final PodTemplateListItemsTemplateSpecContainersSecurityContext securityContext,
                                                      final PodTemplateListItemsTemplateSpecContainersStartupProbe startupProbe,
                                                      final Boolean stdin,
                                                      final Boolean stdinOnce,
                                                      final String terminationMessagePath,
                                                      final String terminationMessagePolicy,
                                                      final Boolean tty,
                                                      final List<PodTemplateListItemsTemplateSpecContainersVolumeDevices> volumeDevices,
                                                      final List<PodTemplateListItemsTemplateSpecContainersVolumeMounts> volumeMounts,
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

    public List<PodTemplateListItemsTemplateSpecContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<PodTemplateListItemsTemplateSpecContainersEnv> env) {
        this.env = env;
    }

    public List<PodTemplateListItemsTemplateSpecContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<PodTemplateListItemsTemplateSpecContainersEnvFrom> envFrom) {
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

    public PodTemplateListItemsTemplateSpecContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final PodTemplateListItemsTemplateSpecContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public PodTemplateListItemsTemplateSpecContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final PodTemplateListItemsTemplateSpecContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<PodTemplateListItemsTemplateSpecContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<PodTemplateListItemsTemplateSpecContainersPorts> ports) {
        this.ports = ports;
    }

    public PodTemplateListItemsTemplateSpecContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final PodTemplateListItemsTemplateSpecContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public PodTemplateListItemsTemplateSpecContainersResources getResources() {
        return resources;
    }

    public void setResources(final PodTemplateListItemsTemplateSpecContainersResources resources) {
        this.resources = resources;
    }

    public PodTemplateListItemsTemplateSpecContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final PodTemplateListItemsTemplateSpecContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public PodTemplateListItemsTemplateSpecContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final PodTemplateListItemsTemplateSpecContainersStartupProbe startupProbe) {
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

    public List<PodTemplateListItemsTemplateSpecContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<PodTemplateListItemsTemplateSpecContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<PodTemplateListItemsTemplateSpecContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<PodTemplateListItemsTemplateSpecContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecContainers)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecContainers __otherCasted = (PodTemplateListItemsTemplateSpecContainers) __other;
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
