package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import java.util.List;
import java.util.Objects;

public class JobSpecTemplateSpecInitContainers {
    private List<String> args;
    private List<String> command;
    private List<JobSpecTemplateSpecInitContainersEnv> env;
    private List<JobSpecTemplateSpecInitContainersEnvFrom> envFrom;
    private String image;
    private JobSpecTemplateSpecInitContainersImagePullPolicy imagePullPolicy;
    private JobSpecTemplateSpecInitContainersLifecycle lifecycle;
    private JobSpecTemplateSpecInitContainersLivenessProbe livenessProbe;
    private String name;
    private List<JobSpecTemplateSpecInitContainersPorts> ports;
    private JobSpecTemplateSpecInitContainersReadinessProbe readinessProbe;
    private JobSpecTemplateSpecInitContainersResources resources;
    private JobSpecTemplateSpecInitContainersSecurityContext securityContext;
    private JobSpecTemplateSpecInitContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private JobSpecTemplateSpecInitContainersTerminationMessagePolicy terminationMessagePolicy;
    private Boolean tty;
    private List<JobSpecTemplateSpecInitContainersVolumeDevices> volumeDevices;
    private List<JobSpecTemplateSpecInitContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public JobSpecTemplateSpecInitContainers() {
        // no-op
    }

    public JobSpecTemplateSpecInitContainers(final List<String> args,
                                             final List<String> command,
                                             final List<JobSpecTemplateSpecInitContainersEnv> env,
                                             final List<JobSpecTemplateSpecInitContainersEnvFrom> envFrom,
                                             final String image,
                                             final JobSpecTemplateSpecInitContainersImagePullPolicy imagePullPolicy,
                                             final JobSpecTemplateSpecInitContainersLifecycle lifecycle,
                                             final JobSpecTemplateSpecInitContainersLivenessProbe livenessProbe,
                                             final String name,
                                             final List<JobSpecTemplateSpecInitContainersPorts> ports,
                                             final JobSpecTemplateSpecInitContainersReadinessProbe readinessProbe,
                                             final JobSpecTemplateSpecInitContainersResources resources,
                                             final JobSpecTemplateSpecInitContainersSecurityContext securityContext,
                                             final JobSpecTemplateSpecInitContainersStartupProbe startupProbe,
                                             final Boolean stdin,
                                             final Boolean stdinOnce,
                                             final String terminationMessagePath,
                                             final JobSpecTemplateSpecInitContainersTerminationMessagePolicy terminationMessagePolicy,
                                             final Boolean tty,
                                             final List<JobSpecTemplateSpecInitContainersVolumeDevices> volumeDevices,
                                             final List<JobSpecTemplateSpecInitContainersVolumeMounts> volumeMounts,
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

    public List<JobSpecTemplateSpecInitContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<JobSpecTemplateSpecInitContainersEnv> env) {
        this.env = env;
    }

    public List<JobSpecTemplateSpecInitContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<JobSpecTemplateSpecInitContainersEnvFrom> envFrom) {
        this.envFrom = envFrom;
    }

    public String getImage() {
        return image;
    }

    public void setImage(final String image) {
        this.image = image;
    }

    public JobSpecTemplateSpecInitContainersImagePullPolicy getImagePullPolicy() {
        return imagePullPolicy;
    }

    public void setImagePullPolicy(final JobSpecTemplateSpecInitContainersImagePullPolicy imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }

    public JobSpecTemplateSpecInitContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final JobSpecTemplateSpecInitContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public JobSpecTemplateSpecInitContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final JobSpecTemplateSpecInitContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<JobSpecTemplateSpecInitContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<JobSpecTemplateSpecInitContainersPorts> ports) {
        this.ports = ports;
    }

    public JobSpecTemplateSpecInitContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final JobSpecTemplateSpecInitContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public JobSpecTemplateSpecInitContainersResources getResources() {
        return resources;
    }

    public void setResources(final JobSpecTemplateSpecInitContainersResources resources) {
        this.resources = resources;
    }

    public JobSpecTemplateSpecInitContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final JobSpecTemplateSpecInitContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public JobSpecTemplateSpecInitContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final JobSpecTemplateSpecInitContainersStartupProbe startupProbe) {
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

    public JobSpecTemplateSpecInitContainersTerminationMessagePolicy getTerminationMessagePolicy() {
        return terminationMessagePolicy;
    }

    public void setTerminationMessagePolicy(final JobSpecTemplateSpecInitContainersTerminationMessagePolicy terminationMessagePolicy) {
        this.terminationMessagePolicy = terminationMessagePolicy;
    }

    public Boolean getTty() {
        return tty;
    }

    public void setTty(final Boolean tty) {
        this.tty = tty;
    }

    public List<JobSpecTemplateSpecInitContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<JobSpecTemplateSpecInitContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<JobSpecTemplateSpecInitContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<JobSpecTemplateSpecInitContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof JobSpecTemplateSpecInitContainers)) {
            return false;
        }
        final JobSpecTemplateSpecInitContainers __otherCasted = (JobSpecTemplateSpecInitContainers) __other;
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
