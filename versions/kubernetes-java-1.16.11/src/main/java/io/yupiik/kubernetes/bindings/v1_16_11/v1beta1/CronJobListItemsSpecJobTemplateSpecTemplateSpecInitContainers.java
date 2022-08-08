package io.yupiik.kubernetes.bindings.v1_16_11.v1beta1;

import java.util.List;
import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainers {
    private List<String> args;
    private List<String> command;
    private List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnv> env;
    private List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecycle lifecycle;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbe livenessProbe;
    private String name;
    private List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersPorts> ports;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersReadinessProbe readinessProbe;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersResources resources;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersSecurityContext securityContext;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersVolumeDevices> volumeDevices;
    private List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainers() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainers(final List<String> args,
                                                                         final List<String> command,
                                                                         final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnv> env,
                                                                         final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvFrom> envFrom,
                                                                         final String image,
                                                                         final String imagePullPolicy,
                                                                         final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecycle lifecycle,
                                                                         final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbe livenessProbe,
                                                                         final String name,
                                                                         final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersPorts> ports,
                                                                         final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersReadinessProbe readinessProbe,
                                                                         final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersResources resources,
                                                                         final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersSecurityContext securityContext,
                                                                         final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersStartupProbe startupProbe,
                                                                         final Boolean stdin,
                                                                         final Boolean stdinOnce,
                                                                         final String terminationMessagePath,
                                                                         final String terminationMessagePolicy,
                                                                         final Boolean tty,
                                                                         final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersVolumeDevices> volumeDevices,
                                                                         final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersVolumeMounts> volumeMounts,
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

    public List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnv> env) {
        this.env = env;
    }

    public List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvFrom> envFrom) {
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

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersPorts> ports) {
        this.ports = ports;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersResources getResources() {
        return resources;
    }

    public void setResources(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersResources resources) {
        this.resources = resources;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersStartupProbe startupProbe) {
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

    public List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainers)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainers __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainers) __other;
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
