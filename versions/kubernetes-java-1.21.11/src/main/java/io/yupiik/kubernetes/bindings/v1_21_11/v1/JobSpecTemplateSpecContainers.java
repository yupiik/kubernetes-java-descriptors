package io.yupiik.kubernetes.bindings.v1_21_11.v1;

import java.util.List;
import java.util.Objects;

public class JobSpecTemplateSpecContainers {
    private List<String> args;
    private List<String> command;
    private List<JobSpecTemplateSpecContainersEnv> env;
    private List<JobSpecTemplateSpecContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private JobSpecTemplateSpecContainersLifecycle lifecycle;
    private JobSpecTemplateSpecContainersLivenessProbe livenessProbe;
    private String name;
    private List<JobSpecTemplateSpecContainersPorts> ports;
    private JobSpecTemplateSpecContainersReadinessProbe readinessProbe;
    private JobSpecTemplateSpecContainersResources resources;
    private JobSpecTemplateSpecContainersSecurityContext securityContext;
    private JobSpecTemplateSpecContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<JobSpecTemplateSpecContainersVolumeDevices> volumeDevices;
    private List<JobSpecTemplateSpecContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public JobSpecTemplateSpecContainers() {
        // no-op
    }

    public JobSpecTemplateSpecContainers(final List<String> args,
                                         final List<String> command,
                                         final List<JobSpecTemplateSpecContainersEnv> env,
                                         final List<JobSpecTemplateSpecContainersEnvFrom> envFrom,
                                         final String image,
                                         final String imagePullPolicy,
                                         final JobSpecTemplateSpecContainersLifecycle lifecycle,
                                         final JobSpecTemplateSpecContainersLivenessProbe livenessProbe,
                                         final String name,
                                         final List<JobSpecTemplateSpecContainersPorts> ports,
                                         final JobSpecTemplateSpecContainersReadinessProbe readinessProbe,
                                         final JobSpecTemplateSpecContainersResources resources,
                                         final JobSpecTemplateSpecContainersSecurityContext securityContext,
                                         final JobSpecTemplateSpecContainersStartupProbe startupProbe,
                                         final Boolean stdin,
                                         final Boolean stdinOnce,
                                         final String terminationMessagePath,
                                         final String terminationMessagePolicy,
                                         final Boolean tty,
                                         final List<JobSpecTemplateSpecContainersVolumeDevices> volumeDevices,
                                         final List<JobSpecTemplateSpecContainersVolumeMounts> volumeMounts,
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

    public List<JobSpecTemplateSpecContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<JobSpecTemplateSpecContainersEnv> env) {
        this.env = env;
    }

    public List<JobSpecTemplateSpecContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<JobSpecTemplateSpecContainersEnvFrom> envFrom) {
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

    public JobSpecTemplateSpecContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final JobSpecTemplateSpecContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public JobSpecTemplateSpecContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final JobSpecTemplateSpecContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<JobSpecTemplateSpecContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<JobSpecTemplateSpecContainersPorts> ports) {
        this.ports = ports;
    }

    public JobSpecTemplateSpecContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final JobSpecTemplateSpecContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public JobSpecTemplateSpecContainersResources getResources() {
        return resources;
    }

    public void setResources(final JobSpecTemplateSpecContainersResources resources) {
        this.resources = resources;
    }

    public JobSpecTemplateSpecContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final JobSpecTemplateSpecContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public JobSpecTemplateSpecContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final JobSpecTemplateSpecContainersStartupProbe startupProbe) {
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

    public List<JobSpecTemplateSpecContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<JobSpecTemplateSpecContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<JobSpecTemplateSpecContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<JobSpecTemplateSpecContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof JobSpecTemplateSpecContainers)) {
            return false;
        }
        final JobSpecTemplateSpecContainers __otherCasted = (JobSpecTemplateSpecContainers) __other;
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
