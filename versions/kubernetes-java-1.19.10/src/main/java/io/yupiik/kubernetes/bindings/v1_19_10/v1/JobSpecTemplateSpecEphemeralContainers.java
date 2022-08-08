package io.yupiik.kubernetes.bindings.v1_19_10.v1;

import java.util.List;
import java.util.Objects;

public class JobSpecTemplateSpecEphemeralContainers {
    private List<String> args;
    private List<String> command;
    private List<JobSpecTemplateSpecEphemeralContainersEnv> env;
    private List<JobSpecTemplateSpecEphemeralContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private JobSpecTemplateSpecEphemeralContainersLifecycle lifecycle;
    private JobSpecTemplateSpecEphemeralContainersLivenessProbe livenessProbe;
    private String name;
    private List<JobSpecTemplateSpecEphemeralContainersPorts> ports;
    private JobSpecTemplateSpecEphemeralContainersReadinessProbe readinessProbe;
    private JobSpecTemplateSpecEphemeralContainersResources resources;
    private JobSpecTemplateSpecEphemeralContainersSecurityContext securityContext;
    private JobSpecTemplateSpecEphemeralContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String targetContainerName;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<JobSpecTemplateSpecEphemeralContainersVolumeDevices> volumeDevices;
    private List<JobSpecTemplateSpecEphemeralContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public JobSpecTemplateSpecEphemeralContainers() {
        // no-op
    }

    public JobSpecTemplateSpecEphemeralContainers(final List<String> args,
                                                  final List<String> command,
                                                  final List<JobSpecTemplateSpecEphemeralContainersEnv> env,
                                                  final List<JobSpecTemplateSpecEphemeralContainersEnvFrom> envFrom,
                                                  final String image,
                                                  final String imagePullPolicy,
                                                  final JobSpecTemplateSpecEphemeralContainersLifecycle lifecycle,
                                                  final JobSpecTemplateSpecEphemeralContainersLivenessProbe livenessProbe,
                                                  final String name,
                                                  final List<JobSpecTemplateSpecEphemeralContainersPorts> ports,
                                                  final JobSpecTemplateSpecEphemeralContainersReadinessProbe readinessProbe,
                                                  final JobSpecTemplateSpecEphemeralContainersResources resources,
                                                  final JobSpecTemplateSpecEphemeralContainersSecurityContext securityContext,
                                                  final JobSpecTemplateSpecEphemeralContainersStartupProbe startupProbe,
                                                  final Boolean stdin,
                                                  final Boolean stdinOnce,
                                                  final String targetContainerName,
                                                  final String terminationMessagePath,
                                                  final String terminationMessagePolicy,
                                                  final Boolean tty,
                                                  final List<JobSpecTemplateSpecEphemeralContainersVolumeDevices> volumeDevices,
                                                  final List<JobSpecTemplateSpecEphemeralContainersVolumeMounts> volumeMounts,
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

    public List<JobSpecTemplateSpecEphemeralContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<JobSpecTemplateSpecEphemeralContainersEnv> env) {
        this.env = env;
    }

    public List<JobSpecTemplateSpecEphemeralContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<JobSpecTemplateSpecEphemeralContainersEnvFrom> envFrom) {
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

    public JobSpecTemplateSpecEphemeralContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final JobSpecTemplateSpecEphemeralContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public JobSpecTemplateSpecEphemeralContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final JobSpecTemplateSpecEphemeralContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<JobSpecTemplateSpecEphemeralContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<JobSpecTemplateSpecEphemeralContainersPorts> ports) {
        this.ports = ports;
    }

    public JobSpecTemplateSpecEphemeralContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final JobSpecTemplateSpecEphemeralContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public JobSpecTemplateSpecEphemeralContainersResources getResources() {
        return resources;
    }

    public void setResources(final JobSpecTemplateSpecEphemeralContainersResources resources) {
        this.resources = resources;
    }

    public JobSpecTemplateSpecEphemeralContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final JobSpecTemplateSpecEphemeralContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public JobSpecTemplateSpecEphemeralContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final JobSpecTemplateSpecEphemeralContainersStartupProbe startupProbe) {
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

    public List<JobSpecTemplateSpecEphemeralContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<JobSpecTemplateSpecEphemeralContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<JobSpecTemplateSpecEphemeralContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<JobSpecTemplateSpecEphemeralContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof JobSpecTemplateSpecEphemeralContainers)) {
            return false;
        }
        final JobSpecTemplateSpecEphemeralContainers __otherCasted = (JobSpecTemplateSpecEphemeralContainers) __other;
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
