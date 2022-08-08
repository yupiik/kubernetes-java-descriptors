package io.yupiik.kubernetes.bindings.v1_14_5;

import java.util.List;
import java.util.Objects;

public class JobListItemsSpecTemplateSpecInitContainers {
    private List<String> args;
    private List<String> command;
    private List<JobListItemsSpecTemplateSpecInitContainersEnv> env;
    private List<JobListItemsSpecTemplateSpecInitContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private JobListItemsSpecTemplateSpecInitContainersLifecycle lifecycle;
    private JobListItemsSpecTemplateSpecInitContainersLivenessProbe livenessProbe;
    private String name;
    private List<JobListItemsSpecTemplateSpecInitContainersPorts> ports;
    private JobListItemsSpecTemplateSpecInitContainersReadinessProbe readinessProbe;
    private JobListItemsSpecTemplateSpecInitContainersResources resources;
    private JobListItemsSpecTemplateSpecInitContainersSecurityContext securityContext;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<JobListItemsSpecTemplateSpecInitContainersVolumeDevices> volumeDevices;
    private List<JobListItemsSpecTemplateSpecInitContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public JobListItemsSpecTemplateSpecInitContainers() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecInitContainers(final List<String> args,
                                                      final List<String> command,
                                                      final List<JobListItemsSpecTemplateSpecInitContainersEnv> env,
                                                      final List<JobListItemsSpecTemplateSpecInitContainersEnvFrom> envFrom,
                                                      final String image,
                                                      final String imagePullPolicy,
                                                      final JobListItemsSpecTemplateSpecInitContainersLifecycle lifecycle,
                                                      final JobListItemsSpecTemplateSpecInitContainersLivenessProbe livenessProbe,
                                                      final String name,
                                                      final List<JobListItemsSpecTemplateSpecInitContainersPorts> ports,
                                                      final JobListItemsSpecTemplateSpecInitContainersReadinessProbe readinessProbe,
                                                      final JobListItemsSpecTemplateSpecInitContainersResources resources,
                                                      final JobListItemsSpecTemplateSpecInitContainersSecurityContext securityContext,
                                                      final Boolean stdin,
                                                      final Boolean stdinOnce,
                                                      final String terminationMessagePath,
                                                      final String terminationMessagePolicy,
                                                      final Boolean tty,
                                                      final List<JobListItemsSpecTemplateSpecInitContainersVolumeDevices> volumeDevices,
                                                      final List<JobListItemsSpecTemplateSpecInitContainersVolumeMounts> volumeMounts,
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

    public List<JobListItemsSpecTemplateSpecInitContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<JobListItemsSpecTemplateSpecInitContainersEnv> env) {
        this.env = env;
    }

    public List<JobListItemsSpecTemplateSpecInitContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<JobListItemsSpecTemplateSpecInitContainersEnvFrom> envFrom) {
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

    public JobListItemsSpecTemplateSpecInitContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final JobListItemsSpecTemplateSpecInitContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public JobListItemsSpecTemplateSpecInitContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final JobListItemsSpecTemplateSpecInitContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<JobListItemsSpecTemplateSpecInitContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<JobListItemsSpecTemplateSpecInitContainersPorts> ports) {
        this.ports = ports;
    }

    public JobListItemsSpecTemplateSpecInitContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final JobListItemsSpecTemplateSpecInitContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public JobListItemsSpecTemplateSpecInitContainersResources getResources() {
        return resources;
    }

    public void setResources(final JobListItemsSpecTemplateSpecInitContainersResources resources) {
        this.resources = resources;
    }

    public JobListItemsSpecTemplateSpecInitContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final JobListItemsSpecTemplateSpecInitContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
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

    public List<JobListItemsSpecTemplateSpecInitContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<JobListItemsSpecTemplateSpecInitContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<JobListItemsSpecTemplateSpecInitContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<JobListItemsSpecTemplateSpecInitContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecInitContainers)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecInitContainers __otherCasted = (JobListItemsSpecTemplateSpecInitContainers) __other;
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
