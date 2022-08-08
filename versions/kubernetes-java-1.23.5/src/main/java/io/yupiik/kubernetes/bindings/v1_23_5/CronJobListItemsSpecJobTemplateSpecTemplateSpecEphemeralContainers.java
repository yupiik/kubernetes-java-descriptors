package io.yupiik.kubernetes.bindings.v1_23_5;

import java.util.List;
import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainers {
    private List<String> args;
    private List<String> command;
    private List<CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersEnv> env;
    private List<CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersEnvFrom> envFrom;
    private String image;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersImagePullPolicy imagePullPolicy;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecycle lifecycle;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbe livenessProbe;
    private String name;
    private List<CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersPorts> ports;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbe readinessProbe;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersResources resources;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersSecurityContext securityContext;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String targetContainerName;
    private String terminationMessagePath;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersTerminationMessagePolicy terminationMessagePolicy;
    private Boolean tty;
    private List<CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersVolumeDevices> volumeDevices;
    private List<CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainers() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainers(final List<String> args,
                                                                              final List<String> command,
                                                                              final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersEnv> env,
                                                                              final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersEnvFrom> envFrom,
                                                                              final String image,
                                                                              final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersImagePullPolicy imagePullPolicy,
                                                                              final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecycle lifecycle,
                                                                              final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbe livenessProbe,
                                                                              final String name,
                                                                              final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersPorts> ports,
                                                                              final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbe readinessProbe,
                                                                              final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersResources resources,
                                                                              final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersSecurityContext securityContext,
                                                                              final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersStartupProbe startupProbe,
                                                                              final Boolean stdin,
                                                                              final Boolean stdinOnce,
                                                                              final String targetContainerName,
                                                                              final String terminationMessagePath,
                                                                              final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersTerminationMessagePolicy terminationMessagePolicy,
                                                                              final Boolean tty,
                                                                              final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersVolumeDevices> volumeDevices,
                                                                              final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersVolumeMounts> volumeMounts,
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

    public List<CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersEnv> env) {
        this.env = env;
    }

    public List<CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersEnvFrom> envFrom) {
        this.envFrom = envFrom;
    }

    public String getImage() {
        return image;
    }

    public void setImage(final String image) {
        this.image = image;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersImagePullPolicy getImagePullPolicy() {
        return imagePullPolicy;
    }

    public void setImagePullPolicy(final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersImagePullPolicy imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersPorts> ports) {
        this.ports = ports;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersResources getResources() {
        return resources;
    }

    public void setResources(final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersResources resources) {
        this.resources = resources;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersStartupProbe startupProbe) {
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

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersTerminationMessagePolicy getTerminationMessagePolicy() {
        return terminationMessagePolicy;
    }

    public void setTerminationMessagePolicy(final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersTerminationMessagePolicy terminationMessagePolicy) {
        this.terminationMessagePolicy = terminationMessagePolicy;
    }

    public Boolean getTty() {
        return tty;
    }

    public void setTty(final Boolean tty) {
        this.tty = tty;
    }

    public List<CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainers)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainers __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainers) __other;
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
