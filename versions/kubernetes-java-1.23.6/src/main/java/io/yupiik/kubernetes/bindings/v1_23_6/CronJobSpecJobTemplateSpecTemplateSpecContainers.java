package io.yupiik.kubernetes.bindings.v1_23_6;

import java.util.List;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecContainers {
    private List<String> args;
    private List<String> command;
    private List<CronJobSpecJobTemplateSpecTemplateSpecContainersEnv> env;
    private List<CronJobSpecJobTemplateSpecTemplateSpecContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private CronJobSpecJobTemplateSpecTemplateSpecContainersLifecycle lifecycle;
    private CronJobSpecJobTemplateSpecTemplateSpecContainersLivenessProbe livenessProbe;
    private String name;
    private List<CronJobSpecJobTemplateSpecTemplateSpecContainersPorts> ports;
    private CronJobSpecJobTemplateSpecTemplateSpecContainersReadinessProbe readinessProbe;
    private CronJobSpecJobTemplateSpecTemplateSpecContainersResources resources;
    private CronJobSpecJobTemplateSpecTemplateSpecContainersSecurityContext securityContext;
    private CronJobSpecJobTemplateSpecTemplateSpecContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<CronJobSpecJobTemplateSpecTemplateSpecContainersVolumeDevices> volumeDevices;
    private List<CronJobSpecJobTemplateSpecTemplateSpecContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public CronJobSpecJobTemplateSpecTemplateSpecContainers() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainers(final List<String> args,
                                                            final List<String> command,
                                                            final List<CronJobSpecJobTemplateSpecTemplateSpecContainersEnv> env,
                                                            final List<CronJobSpecJobTemplateSpecTemplateSpecContainersEnvFrom> envFrom,
                                                            final String image,
                                                            final String imagePullPolicy,
                                                            final CronJobSpecJobTemplateSpecTemplateSpecContainersLifecycle lifecycle,
                                                            final CronJobSpecJobTemplateSpecTemplateSpecContainersLivenessProbe livenessProbe,
                                                            final String name,
                                                            final List<CronJobSpecJobTemplateSpecTemplateSpecContainersPorts> ports,
                                                            final CronJobSpecJobTemplateSpecTemplateSpecContainersReadinessProbe readinessProbe,
                                                            final CronJobSpecJobTemplateSpecTemplateSpecContainersResources resources,
                                                            final CronJobSpecJobTemplateSpecTemplateSpecContainersSecurityContext securityContext,
                                                            final CronJobSpecJobTemplateSpecTemplateSpecContainersStartupProbe startupProbe,
                                                            final Boolean stdin,
                                                            final Boolean stdinOnce,
                                                            final String terminationMessagePath,
                                                            final String terminationMessagePolicy,
                                                            final Boolean tty,
                                                            final List<CronJobSpecJobTemplateSpecTemplateSpecContainersVolumeDevices> volumeDevices,
                                                            final List<CronJobSpecJobTemplateSpecTemplateSpecContainersVolumeMounts> volumeMounts,
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

    public List<CronJobSpecJobTemplateSpecTemplateSpecContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<CronJobSpecJobTemplateSpecTemplateSpecContainersEnv> env) {
        this.env = env;
    }

    public List<CronJobSpecJobTemplateSpecTemplateSpecContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<CronJobSpecJobTemplateSpecTemplateSpecContainersEnvFrom> envFrom) {
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

    public CronJobSpecJobTemplateSpecTemplateSpecContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final CronJobSpecJobTemplateSpecTemplateSpecContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final CronJobSpecJobTemplateSpecTemplateSpecContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<CronJobSpecJobTemplateSpecTemplateSpecContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<CronJobSpecJobTemplateSpecTemplateSpecContainersPorts> ports) {
        this.ports = ports;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final CronJobSpecJobTemplateSpecTemplateSpecContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersResources getResources() {
        return resources;
    }

    public void setResources(final CronJobSpecJobTemplateSpecTemplateSpecContainersResources resources) {
        this.resources = resources;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final CronJobSpecJobTemplateSpecTemplateSpecContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final CronJobSpecJobTemplateSpecTemplateSpecContainersStartupProbe startupProbe) {
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

    public List<CronJobSpecJobTemplateSpecTemplateSpecContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<CronJobSpecJobTemplateSpecTemplateSpecContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<CronJobSpecJobTemplateSpecTemplateSpecContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<CronJobSpecJobTemplateSpecTemplateSpecContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecContainers)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecContainers __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecContainers) __other;
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
