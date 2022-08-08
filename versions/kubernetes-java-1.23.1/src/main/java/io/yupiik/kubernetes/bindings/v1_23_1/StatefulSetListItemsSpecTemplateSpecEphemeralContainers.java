package io.yupiik.kubernetes.bindings.v1_23_1;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecEphemeralContainers {
    private List<String> args;
    private List<String> command;
    private List<StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnv> env;
    private List<StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvFrom> envFrom;
    private String image;
    private StatefulSetListItemsSpecTemplateSpecEphemeralContainersImagePullPolicy imagePullPolicy;
    private StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecycle lifecycle;
    private StatefulSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbe livenessProbe;
    private String name;
    private List<StatefulSetListItemsSpecTemplateSpecEphemeralContainersPorts> ports;
    private StatefulSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbe readinessProbe;
    private StatefulSetListItemsSpecTemplateSpecEphemeralContainersResources resources;
    private StatefulSetListItemsSpecTemplateSpecEphemeralContainersSecurityContext securityContext;
    private StatefulSetListItemsSpecTemplateSpecEphemeralContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String targetContainerName;
    private String terminationMessagePath;
    private StatefulSetListItemsSpecTemplateSpecEphemeralContainersTerminationMessagePolicy terminationMessagePolicy;
    private Boolean tty;
    private List<StatefulSetListItemsSpecTemplateSpecEphemeralContainersVolumeDevices> volumeDevices;
    private List<StatefulSetListItemsSpecTemplateSpecEphemeralContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainers() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainers(final List<String> args,
                                                                   final List<String> command,
                                                                   final List<StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnv> env,
                                                                   final List<StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvFrom> envFrom,
                                                                   final String image,
                                                                   final StatefulSetListItemsSpecTemplateSpecEphemeralContainersImagePullPolicy imagePullPolicy,
                                                                   final StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecycle lifecycle,
                                                                   final StatefulSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbe livenessProbe,
                                                                   final String name,
                                                                   final List<StatefulSetListItemsSpecTemplateSpecEphemeralContainersPorts> ports,
                                                                   final StatefulSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbe readinessProbe,
                                                                   final StatefulSetListItemsSpecTemplateSpecEphemeralContainersResources resources,
                                                                   final StatefulSetListItemsSpecTemplateSpecEphemeralContainersSecurityContext securityContext,
                                                                   final StatefulSetListItemsSpecTemplateSpecEphemeralContainersStartupProbe startupProbe,
                                                                   final Boolean stdin,
                                                                   final Boolean stdinOnce,
                                                                   final String targetContainerName,
                                                                   final String terminationMessagePath,
                                                                   final StatefulSetListItemsSpecTemplateSpecEphemeralContainersTerminationMessagePolicy terminationMessagePolicy,
                                                                   final Boolean tty,
                                                                   final List<StatefulSetListItemsSpecTemplateSpecEphemeralContainersVolumeDevices> volumeDevices,
                                                                   final List<StatefulSetListItemsSpecTemplateSpecEphemeralContainersVolumeMounts> volumeMounts,
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

    public List<StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnv> env) {
        this.env = env;
    }

    public List<StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvFrom> envFrom) {
        this.envFrom = envFrom;
    }

    public String getImage() {
        return image;
    }

    public void setImage(final String image) {
        this.image = image;
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersImagePullPolicy getImagePullPolicy() {
        return imagePullPolicy;
    }

    public void setImagePullPolicy(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersImagePullPolicy imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<StatefulSetListItemsSpecTemplateSpecEphemeralContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<StatefulSetListItemsSpecTemplateSpecEphemeralContainersPorts> ports) {
        this.ports = ports;
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersResources getResources() {
        return resources;
    }

    public void setResources(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersResources resources) {
        this.resources = resources;
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersStartupProbe startupProbe) {
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

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersTerminationMessagePolicy getTerminationMessagePolicy() {
        return terminationMessagePolicy;
    }

    public void setTerminationMessagePolicy(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersTerminationMessagePolicy terminationMessagePolicy) {
        this.terminationMessagePolicy = terminationMessagePolicy;
    }

    public Boolean getTty() {
        return tty;
    }

    public void setTty(final Boolean tty) {
        this.tty = tty;
    }

    public List<StatefulSetListItemsSpecTemplateSpecEphemeralContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<StatefulSetListItemsSpecTemplateSpecEphemeralContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<StatefulSetListItemsSpecTemplateSpecEphemeralContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<StatefulSetListItemsSpecTemplateSpecEphemeralContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecEphemeralContainers)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecEphemeralContainers __otherCasted = (StatefulSetListItemsSpecTemplateSpecEphemeralContainers) __other;
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
