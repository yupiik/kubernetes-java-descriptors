package io.yupiik.kubernetes.bindings.v1_17_15;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecContainers {
    private List<String> args;
    private List<String> command;
    private List<ReplicationControllerSpecTemplateSpecContainersEnv> env;
    private List<ReplicationControllerSpecTemplateSpecContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private ReplicationControllerSpecTemplateSpecContainersLifecycle lifecycle;
    private ReplicationControllerSpecTemplateSpecContainersLivenessProbe livenessProbe;
    private String name;
    private List<ReplicationControllerSpecTemplateSpecContainersPorts> ports;
    private ReplicationControllerSpecTemplateSpecContainersReadinessProbe readinessProbe;
    private ReplicationControllerSpecTemplateSpecContainersResources resources;
    private ReplicationControllerSpecTemplateSpecContainersSecurityContext securityContext;
    private ReplicationControllerSpecTemplateSpecContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<ReplicationControllerSpecTemplateSpecContainersVolumeDevices> volumeDevices;
    private List<ReplicationControllerSpecTemplateSpecContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public ReplicationControllerSpecTemplateSpecContainers() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecContainers(final List<String> args,
                                                           final List<String> command,
                                                           final List<ReplicationControllerSpecTemplateSpecContainersEnv> env,
                                                           final List<ReplicationControllerSpecTemplateSpecContainersEnvFrom> envFrom,
                                                           final String image,
                                                           final String imagePullPolicy,
                                                           final ReplicationControllerSpecTemplateSpecContainersLifecycle lifecycle,
                                                           final ReplicationControllerSpecTemplateSpecContainersLivenessProbe livenessProbe,
                                                           final String name,
                                                           final List<ReplicationControllerSpecTemplateSpecContainersPorts> ports,
                                                           final ReplicationControllerSpecTemplateSpecContainersReadinessProbe readinessProbe,
                                                           final ReplicationControllerSpecTemplateSpecContainersResources resources,
                                                           final ReplicationControllerSpecTemplateSpecContainersSecurityContext securityContext,
                                                           final ReplicationControllerSpecTemplateSpecContainersStartupProbe startupProbe,
                                                           final Boolean stdin,
                                                           final Boolean stdinOnce,
                                                           final String terminationMessagePath,
                                                           final String terminationMessagePolicy,
                                                           final Boolean tty,
                                                           final List<ReplicationControllerSpecTemplateSpecContainersVolumeDevices> volumeDevices,
                                                           final List<ReplicationControllerSpecTemplateSpecContainersVolumeMounts> volumeMounts,
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

    public List<ReplicationControllerSpecTemplateSpecContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<ReplicationControllerSpecTemplateSpecContainersEnv> env) {
        this.env = env;
    }

    public List<ReplicationControllerSpecTemplateSpecContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<ReplicationControllerSpecTemplateSpecContainersEnvFrom> envFrom) {
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

    public ReplicationControllerSpecTemplateSpecContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final ReplicationControllerSpecTemplateSpecContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public ReplicationControllerSpecTemplateSpecContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final ReplicationControllerSpecTemplateSpecContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<ReplicationControllerSpecTemplateSpecContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<ReplicationControllerSpecTemplateSpecContainersPorts> ports) {
        this.ports = ports;
    }

    public ReplicationControllerSpecTemplateSpecContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final ReplicationControllerSpecTemplateSpecContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public ReplicationControllerSpecTemplateSpecContainersResources getResources() {
        return resources;
    }

    public void setResources(final ReplicationControllerSpecTemplateSpecContainersResources resources) {
        this.resources = resources;
    }

    public ReplicationControllerSpecTemplateSpecContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final ReplicationControllerSpecTemplateSpecContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public ReplicationControllerSpecTemplateSpecContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final ReplicationControllerSpecTemplateSpecContainersStartupProbe startupProbe) {
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

    public List<ReplicationControllerSpecTemplateSpecContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<ReplicationControllerSpecTemplateSpecContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<ReplicationControllerSpecTemplateSpecContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<ReplicationControllerSpecTemplateSpecContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecContainers)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecContainers __otherCasted = (ReplicationControllerSpecTemplateSpecContainers) __other;
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
