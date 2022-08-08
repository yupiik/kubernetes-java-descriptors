package io.yupiik.kubernetes.bindings.v1_20_3.v1;

import java.util.List;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecInitContainers {
    private List<String> args;
    private List<String> command;
    private List<StatefulSetSpecTemplateSpecInitContainersEnv> env;
    private List<StatefulSetSpecTemplateSpecInitContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private StatefulSetSpecTemplateSpecInitContainersLifecycle lifecycle;
    private StatefulSetSpecTemplateSpecInitContainersLivenessProbe livenessProbe;
    private String name;
    private List<StatefulSetSpecTemplateSpecInitContainersPorts> ports;
    private StatefulSetSpecTemplateSpecInitContainersReadinessProbe readinessProbe;
    private StatefulSetSpecTemplateSpecInitContainersResources resources;
    private StatefulSetSpecTemplateSpecInitContainersSecurityContext securityContext;
    private StatefulSetSpecTemplateSpecInitContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<StatefulSetSpecTemplateSpecInitContainersVolumeDevices> volumeDevices;
    private List<StatefulSetSpecTemplateSpecInitContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public StatefulSetSpecTemplateSpecInitContainers() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecInitContainers(final List<String> args,
                                                     final List<String> command,
                                                     final List<StatefulSetSpecTemplateSpecInitContainersEnv> env,
                                                     final List<StatefulSetSpecTemplateSpecInitContainersEnvFrom> envFrom,
                                                     final String image,
                                                     final String imagePullPolicy,
                                                     final StatefulSetSpecTemplateSpecInitContainersLifecycle lifecycle,
                                                     final StatefulSetSpecTemplateSpecInitContainersLivenessProbe livenessProbe,
                                                     final String name,
                                                     final List<StatefulSetSpecTemplateSpecInitContainersPorts> ports,
                                                     final StatefulSetSpecTemplateSpecInitContainersReadinessProbe readinessProbe,
                                                     final StatefulSetSpecTemplateSpecInitContainersResources resources,
                                                     final StatefulSetSpecTemplateSpecInitContainersSecurityContext securityContext,
                                                     final StatefulSetSpecTemplateSpecInitContainersStartupProbe startupProbe,
                                                     final Boolean stdin,
                                                     final Boolean stdinOnce,
                                                     final String terminationMessagePath,
                                                     final String terminationMessagePolicy,
                                                     final Boolean tty,
                                                     final List<StatefulSetSpecTemplateSpecInitContainersVolumeDevices> volumeDevices,
                                                     final List<StatefulSetSpecTemplateSpecInitContainersVolumeMounts> volumeMounts,
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

    public List<StatefulSetSpecTemplateSpecInitContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<StatefulSetSpecTemplateSpecInitContainersEnv> env) {
        this.env = env;
    }

    public List<StatefulSetSpecTemplateSpecInitContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<StatefulSetSpecTemplateSpecInitContainersEnvFrom> envFrom) {
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

    public StatefulSetSpecTemplateSpecInitContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final StatefulSetSpecTemplateSpecInitContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public StatefulSetSpecTemplateSpecInitContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final StatefulSetSpecTemplateSpecInitContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<StatefulSetSpecTemplateSpecInitContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<StatefulSetSpecTemplateSpecInitContainersPorts> ports) {
        this.ports = ports;
    }

    public StatefulSetSpecTemplateSpecInitContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final StatefulSetSpecTemplateSpecInitContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public StatefulSetSpecTemplateSpecInitContainersResources getResources() {
        return resources;
    }

    public void setResources(final StatefulSetSpecTemplateSpecInitContainersResources resources) {
        this.resources = resources;
    }

    public StatefulSetSpecTemplateSpecInitContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final StatefulSetSpecTemplateSpecInitContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public StatefulSetSpecTemplateSpecInitContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final StatefulSetSpecTemplateSpecInitContainersStartupProbe startupProbe) {
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

    public List<StatefulSetSpecTemplateSpecInitContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<StatefulSetSpecTemplateSpecInitContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<StatefulSetSpecTemplateSpecInitContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<StatefulSetSpecTemplateSpecInitContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecInitContainers)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecInitContainers __otherCasted = (StatefulSetSpecTemplateSpecInitContainers) __other;
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
