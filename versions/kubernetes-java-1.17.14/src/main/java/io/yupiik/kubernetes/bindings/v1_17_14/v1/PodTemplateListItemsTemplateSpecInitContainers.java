package io.yupiik.kubernetes.bindings.v1_17_14.v1;

import java.util.List;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecInitContainers {
    private List<String> args;
    private List<String> command;
    private List<PodTemplateListItemsTemplateSpecInitContainersEnv> env;
    private List<PodTemplateListItemsTemplateSpecInitContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private PodTemplateListItemsTemplateSpecInitContainersLifecycle lifecycle;
    private PodTemplateListItemsTemplateSpecInitContainersLivenessProbe livenessProbe;
    private String name;
    private List<PodTemplateListItemsTemplateSpecInitContainersPorts> ports;
    private PodTemplateListItemsTemplateSpecInitContainersReadinessProbe readinessProbe;
    private PodTemplateListItemsTemplateSpecInitContainersResources resources;
    private PodTemplateListItemsTemplateSpecInitContainersSecurityContext securityContext;
    private PodTemplateListItemsTemplateSpecInitContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<PodTemplateListItemsTemplateSpecInitContainersVolumeDevices> volumeDevices;
    private List<PodTemplateListItemsTemplateSpecInitContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public PodTemplateListItemsTemplateSpecInitContainers() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecInitContainers(final List<String> args,
                                                          final List<String> command,
                                                          final List<PodTemplateListItemsTemplateSpecInitContainersEnv> env,
                                                          final List<PodTemplateListItemsTemplateSpecInitContainersEnvFrom> envFrom,
                                                          final String image,
                                                          final String imagePullPolicy,
                                                          final PodTemplateListItemsTemplateSpecInitContainersLifecycle lifecycle,
                                                          final PodTemplateListItemsTemplateSpecInitContainersLivenessProbe livenessProbe,
                                                          final String name,
                                                          final List<PodTemplateListItemsTemplateSpecInitContainersPorts> ports,
                                                          final PodTemplateListItemsTemplateSpecInitContainersReadinessProbe readinessProbe,
                                                          final PodTemplateListItemsTemplateSpecInitContainersResources resources,
                                                          final PodTemplateListItemsTemplateSpecInitContainersSecurityContext securityContext,
                                                          final PodTemplateListItemsTemplateSpecInitContainersStartupProbe startupProbe,
                                                          final Boolean stdin,
                                                          final Boolean stdinOnce,
                                                          final String terminationMessagePath,
                                                          final String terminationMessagePolicy,
                                                          final Boolean tty,
                                                          final List<PodTemplateListItemsTemplateSpecInitContainersVolumeDevices> volumeDevices,
                                                          final List<PodTemplateListItemsTemplateSpecInitContainersVolumeMounts> volumeMounts,
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

    public List<PodTemplateListItemsTemplateSpecInitContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<PodTemplateListItemsTemplateSpecInitContainersEnv> env) {
        this.env = env;
    }

    public List<PodTemplateListItemsTemplateSpecInitContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<PodTemplateListItemsTemplateSpecInitContainersEnvFrom> envFrom) {
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

    public PodTemplateListItemsTemplateSpecInitContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final PodTemplateListItemsTemplateSpecInitContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public PodTemplateListItemsTemplateSpecInitContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final PodTemplateListItemsTemplateSpecInitContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<PodTemplateListItemsTemplateSpecInitContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<PodTemplateListItemsTemplateSpecInitContainersPorts> ports) {
        this.ports = ports;
    }

    public PodTemplateListItemsTemplateSpecInitContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final PodTemplateListItemsTemplateSpecInitContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public PodTemplateListItemsTemplateSpecInitContainersResources getResources() {
        return resources;
    }

    public void setResources(final PodTemplateListItemsTemplateSpecInitContainersResources resources) {
        this.resources = resources;
    }

    public PodTemplateListItemsTemplateSpecInitContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final PodTemplateListItemsTemplateSpecInitContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public PodTemplateListItemsTemplateSpecInitContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final PodTemplateListItemsTemplateSpecInitContainersStartupProbe startupProbe) {
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

    public List<PodTemplateListItemsTemplateSpecInitContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<PodTemplateListItemsTemplateSpecInitContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<PodTemplateListItemsTemplateSpecInitContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<PodTemplateListItemsTemplateSpecInitContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecInitContainers)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecInitContainers __otherCasted = (PodTemplateListItemsTemplateSpecInitContainers) __other;
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
