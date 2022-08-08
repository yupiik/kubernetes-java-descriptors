package io.yupiik.kubernetes.bindings.v1_19_2;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecInitContainers {
    private List<String> args;
    private List<String> command;
    private List<ReplicationControllerSpecTemplateSpecInitContainersEnv> env;
    private List<ReplicationControllerSpecTemplateSpecInitContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private ReplicationControllerSpecTemplateSpecInitContainersLifecycle lifecycle;
    private ReplicationControllerSpecTemplateSpecInitContainersLivenessProbe livenessProbe;
    private String name;
    private List<ReplicationControllerSpecTemplateSpecInitContainersPorts> ports;
    private ReplicationControllerSpecTemplateSpecInitContainersReadinessProbe readinessProbe;
    private ReplicationControllerSpecTemplateSpecInitContainersResources resources;
    private ReplicationControllerSpecTemplateSpecInitContainersSecurityContext securityContext;
    private ReplicationControllerSpecTemplateSpecInitContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<ReplicationControllerSpecTemplateSpecInitContainersVolumeDevices> volumeDevices;
    private List<ReplicationControllerSpecTemplateSpecInitContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public ReplicationControllerSpecTemplateSpecInitContainers() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecInitContainers(final List<String> args,
                                                               final List<String> command,
                                                               final List<ReplicationControllerSpecTemplateSpecInitContainersEnv> env,
                                                               final List<ReplicationControllerSpecTemplateSpecInitContainersEnvFrom> envFrom,
                                                               final String image,
                                                               final String imagePullPolicy,
                                                               final ReplicationControllerSpecTemplateSpecInitContainersLifecycle lifecycle,
                                                               final ReplicationControllerSpecTemplateSpecInitContainersLivenessProbe livenessProbe,
                                                               final String name,
                                                               final List<ReplicationControllerSpecTemplateSpecInitContainersPorts> ports,
                                                               final ReplicationControllerSpecTemplateSpecInitContainersReadinessProbe readinessProbe,
                                                               final ReplicationControllerSpecTemplateSpecInitContainersResources resources,
                                                               final ReplicationControllerSpecTemplateSpecInitContainersSecurityContext securityContext,
                                                               final ReplicationControllerSpecTemplateSpecInitContainersStartupProbe startupProbe,
                                                               final Boolean stdin,
                                                               final Boolean stdinOnce,
                                                               final String terminationMessagePath,
                                                               final String terminationMessagePolicy,
                                                               final Boolean tty,
                                                               final List<ReplicationControllerSpecTemplateSpecInitContainersVolumeDevices> volumeDevices,
                                                               final List<ReplicationControllerSpecTemplateSpecInitContainersVolumeMounts> volumeMounts,
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

    public List<ReplicationControllerSpecTemplateSpecInitContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<ReplicationControllerSpecTemplateSpecInitContainersEnv> env) {
        this.env = env;
    }

    public List<ReplicationControllerSpecTemplateSpecInitContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<ReplicationControllerSpecTemplateSpecInitContainersEnvFrom> envFrom) {
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

    public ReplicationControllerSpecTemplateSpecInitContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final ReplicationControllerSpecTemplateSpecInitContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public ReplicationControllerSpecTemplateSpecInitContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final ReplicationControllerSpecTemplateSpecInitContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<ReplicationControllerSpecTemplateSpecInitContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<ReplicationControllerSpecTemplateSpecInitContainersPorts> ports) {
        this.ports = ports;
    }

    public ReplicationControllerSpecTemplateSpecInitContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final ReplicationControllerSpecTemplateSpecInitContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public ReplicationControllerSpecTemplateSpecInitContainersResources getResources() {
        return resources;
    }

    public void setResources(final ReplicationControllerSpecTemplateSpecInitContainersResources resources) {
        this.resources = resources;
    }

    public ReplicationControllerSpecTemplateSpecInitContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final ReplicationControllerSpecTemplateSpecInitContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public ReplicationControllerSpecTemplateSpecInitContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final ReplicationControllerSpecTemplateSpecInitContainersStartupProbe startupProbe) {
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

    public List<ReplicationControllerSpecTemplateSpecInitContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<ReplicationControllerSpecTemplateSpecInitContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<ReplicationControllerSpecTemplateSpecInitContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<ReplicationControllerSpecTemplateSpecInitContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecInitContainers)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecInitContainers __otherCasted = (ReplicationControllerSpecTemplateSpecInitContainers) __other;
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
