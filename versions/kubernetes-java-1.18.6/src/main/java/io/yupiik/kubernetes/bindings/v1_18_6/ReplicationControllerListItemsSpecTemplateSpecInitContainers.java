package io.yupiik.kubernetes.bindings.v1_18_6;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecInitContainers {
    private List<String> args;
    private List<String> command;
    private List<ReplicationControllerListItemsSpecTemplateSpecInitContainersEnv> env;
    private List<ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecycle lifecycle;
    private ReplicationControllerListItemsSpecTemplateSpecInitContainersLivenessProbe livenessProbe;
    private String name;
    private List<ReplicationControllerListItemsSpecTemplateSpecInitContainersPorts> ports;
    private ReplicationControllerListItemsSpecTemplateSpecInitContainersReadinessProbe readinessProbe;
    private ReplicationControllerListItemsSpecTemplateSpecInitContainersResources resources;
    private ReplicationControllerListItemsSpecTemplateSpecInitContainersSecurityContext securityContext;
    private ReplicationControllerListItemsSpecTemplateSpecInitContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<ReplicationControllerListItemsSpecTemplateSpecInitContainersVolumeDevices> volumeDevices;
    private List<ReplicationControllerListItemsSpecTemplateSpecInitContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public ReplicationControllerListItemsSpecTemplateSpecInitContainers() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainers(final List<String> args,
                                                                        final List<String> command,
                                                                        final List<ReplicationControllerListItemsSpecTemplateSpecInitContainersEnv> env,
                                                                        final List<ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvFrom> envFrom,
                                                                        final String image,
                                                                        final String imagePullPolicy,
                                                                        final ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecycle lifecycle,
                                                                        final ReplicationControllerListItemsSpecTemplateSpecInitContainersLivenessProbe livenessProbe,
                                                                        final String name,
                                                                        final List<ReplicationControllerListItemsSpecTemplateSpecInitContainersPorts> ports,
                                                                        final ReplicationControllerListItemsSpecTemplateSpecInitContainersReadinessProbe readinessProbe,
                                                                        final ReplicationControllerListItemsSpecTemplateSpecInitContainersResources resources,
                                                                        final ReplicationControllerListItemsSpecTemplateSpecInitContainersSecurityContext securityContext,
                                                                        final ReplicationControllerListItemsSpecTemplateSpecInitContainersStartupProbe startupProbe,
                                                                        final Boolean stdin,
                                                                        final Boolean stdinOnce,
                                                                        final String terminationMessagePath,
                                                                        final String terminationMessagePolicy,
                                                                        final Boolean tty,
                                                                        final List<ReplicationControllerListItemsSpecTemplateSpecInitContainersVolumeDevices> volumeDevices,
                                                                        final List<ReplicationControllerListItemsSpecTemplateSpecInitContainersVolumeMounts> volumeMounts,
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

    public List<ReplicationControllerListItemsSpecTemplateSpecInitContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<ReplicationControllerListItemsSpecTemplateSpecInitContainersEnv> env) {
        this.env = env;
    }

    public List<ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvFrom> envFrom) {
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

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final ReplicationControllerListItemsSpecTemplateSpecInitContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<ReplicationControllerListItemsSpecTemplateSpecInitContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<ReplicationControllerListItemsSpecTemplateSpecInitContainersPorts> ports) {
        this.ports = ports;
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final ReplicationControllerListItemsSpecTemplateSpecInitContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersResources getResources() {
        return resources;
    }

    public void setResources(final ReplicationControllerListItemsSpecTemplateSpecInitContainersResources resources) {
        this.resources = resources;
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final ReplicationControllerListItemsSpecTemplateSpecInitContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final ReplicationControllerListItemsSpecTemplateSpecInitContainersStartupProbe startupProbe) {
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

    public List<ReplicationControllerListItemsSpecTemplateSpecInitContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<ReplicationControllerListItemsSpecTemplateSpecInitContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<ReplicationControllerListItemsSpecTemplateSpecInitContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<ReplicationControllerListItemsSpecTemplateSpecInitContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecInitContainers)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecInitContainers __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecInitContainers) __other;
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
