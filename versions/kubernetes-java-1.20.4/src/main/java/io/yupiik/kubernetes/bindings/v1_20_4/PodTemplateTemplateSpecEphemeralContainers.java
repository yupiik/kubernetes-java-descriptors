package io.yupiik.kubernetes.bindings.v1_20_4;

import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateSpecEphemeralContainers {
    private List<String> args;
    private List<String> command;
    private List<PodTemplateTemplateSpecEphemeralContainersEnv> env;
    private List<PodTemplateTemplateSpecEphemeralContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private PodTemplateTemplateSpecEphemeralContainersLifecycle lifecycle;
    private PodTemplateTemplateSpecEphemeralContainersLivenessProbe livenessProbe;
    private String name;
    private List<PodTemplateTemplateSpecEphemeralContainersPorts> ports;
    private PodTemplateTemplateSpecEphemeralContainersReadinessProbe readinessProbe;
    private PodTemplateTemplateSpecEphemeralContainersResources resources;
    private PodTemplateTemplateSpecEphemeralContainersSecurityContext securityContext;
    private PodTemplateTemplateSpecEphemeralContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String targetContainerName;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<PodTemplateTemplateSpecEphemeralContainersVolumeDevices> volumeDevices;
    private List<PodTemplateTemplateSpecEphemeralContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public PodTemplateTemplateSpecEphemeralContainers() {
        // no-op
    }

    public PodTemplateTemplateSpecEphemeralContainers(final List<String> args,
                                                      final List<String> command,
                                                      final List<PodTemplateTemplateSpecEphemeralContainersEnv> env,
                                                      final List<PodTemplateTemplateSpecEphemeralContainersEnvFrom> envFrom,
                                                      final String image,
                                                      final String imagePullPolicy,
                                                      final PodTemplateTemplateSpecEphemeralContainersLifecycle lifecycle,
                                                      final PodTemplateTemplateSpecEphemeralContainersLivenessProbe livenessProbe,
                                                      final String name,
                                                      final List<PodTemplateTemplateSpecEphemeralContainersPorts> ports,
                                                      final PodTemplateTemplateSpecEphemeralContainersReadinessProbe readinessProbe,
                                                      final PodTemplateTemplateSpecEphemeralContainersResources resources,
                                                      final PodTemplateTemplateSpecEphemeralContainersSecurityContext securityContext,
                                                      final PodTemplateTemplateSpecEphemeralContainersStartupProbe startupProbe,
                                                      final Boolean stdin,
                                                      final Boolean stdinOnce,
                                                      final String targetContainerName,
                                                      final String terminationMessagePath,
                                                      final String terminationMessagePolicy,
                                                      final Boolean tty,
                                                      final List<PodTemplateTemplateSpecEphemeralContainersVolumeDevices> volumeDevices,
                                                      final List<PodTemplateTemplateSpecEphemeralContainersVolumeMounts> volumeMounts,
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

    public List<PodTemplateTemplateSpecEphemeralContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<PodTemplateTemplateSpecEphemeralContainersEnv> env) {
        this.env = env;
    }

    public List<PodTemplateTemplateSpecEphemeralContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<PodTemplateTemplateSpecEphemeralContainersEnvFrom> envFrom) {
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

    public PodTemplateTemplateSpecEphemeralContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final PodTemplateTemplateSpecEphemeralContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public PodTemplateTemplateSpecEphemeralContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final PodTemplateTemplateSpecEphemeralContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<PodTemplateTemplateSpecEphemeralContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<PodTemplateTemplateSpecEphemeralContainersPorts> ports) {
        this.ports = ports;
    }

    public PodTemplateTemplateSpecEphemeralContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final PodTemplateTemplateSpecEphemeralContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public PodTemplateTemplateSpecEphemeralContainersResources getResources() {
        return resources;
    }

    public void setResources(final PodTemplateTemplateSpecEphemeralContainersResources resources) {
        this.resources = resources;
    }

    public PodTemplateTemplateSpecEphemeralContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final PodTemplateTemplateSpecEphemeralContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public PodTemplateTemplateSpecEphemeralContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final PodTemplateTemplateSpecEphemeralContainersStartupProbe startupProbe) {
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

    public String getTargetContainerName() {
        return targetContainerName;
    }

    public void setTargetContainerName(final String targetContainerName) {
        this.targetContainerName = targetContainerName;
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

    public List<PodTemplateTemplateSpecEphemeralContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<PodTemplateTemplateSpecEphemeralContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<PodTemplateTemplateSpecEphemeralContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<PodTemplateTemplateSpecEphemeralContainersVolumeMounts> volumeMounts) {
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
                targetContainerName,
                terminationMessagePath,
                terminationMessagePolicy,
                tty,
                volumeDevices,
                volumeMounts,
                workingDir);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodTemplateTemplateSpecEphemeralContainers)) {
            return false;
        }
        final PodTemplateTemplateSpecEphemeralContainers __otherCasted = (PodTemplateTemplateSpecEphemeralContainers) __other;
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
            Objects.equals(targetContainerName, __otherCasted.targetContainerName) &&
            Objects.equals(terminationMessagePath, __otherCasted.terminationMessagePath) &&
            Objects.equals(terminationMessagePolicy, __otherCasted.terminationMessagePolicy) &&
            Objects.equals(tty, __otherCasted.tty) &&
            Objects.equals(volumeDevices, __otherCasted.volumeDevices) &&
            Objects.equals(volumeMounts, __otherCasted.volumeMounts) &&
            Objects.equals(workingDir, __otherCasted.workingDir);
    }
}
