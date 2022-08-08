package io.yupiik.kubernetes.bindings.v1_19_11;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecInitContainers {
    private List<String> args;
    private List<String> command;
    private List<StatefulSetListItemsSpecTemplateSpecInitContainersEnv> env;
    private List<StatefulSetListItemsSpecTemplateSpecInitContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private StatefulSetListItemsSpecTemplateSpecInitContainersLifecycle lifecycle;
    private StatefulSetListItemsSpecTemplateSpecInitContainersLivenessProbe livenessProbe;
    private String name;
    private List<StatefulSetListItemsSpecTemplateSpecInitContainersPorts> ports;
    private StatefulSetListItemsSpecTemplateSpecInitContainersReadinessProbe readinessProbe;
    private StatefulSetListItemsSpecTemplateSpecInitContainersResources resources;
    private StatefulSetListItemsSpecTemplateSpecInitContainersSecurityContext securityContext;
    private StatefulSetListItemsSpecTemplateSpecInitContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<StatefulSetListItemsSpecTemplateSpecInitContainersVolumeDevices> volumeDevices;
    private List<StatefulSetListItemsSpecTemplateSpecInitContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public StatefulSetListItemsSpecTemplateSpecInitContainers() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainers(final List<String> args,
                                                              final List<String> command,
                                                              final List<StatefulSetListItemsSpecTemplateSpecInitContainersEnv> env,
                                                              final List<StatefulSetListItemsSpecTemplateSpecInitContainersEnvFrom> envFrom,
                                                              final String image,
                                                              final String imagePullPolicy,
                                                              final StatefulSetListItemsSpecTemplateSpecInitContainersLifecycle lifecycle,
                                                              final StatefulSetListItemsSpecTemplateSpecInitContainersLivenessProbe livenessProbe,
                                                              final String name,
                                                              final List<StatefulSetListItemsSpecTemplateSpecInitContainersPorts> ports,
                                                              final StatefulSetListItemsSpecTemplateSpecInitContainersReadinessProbe readinessProbe,
                                                              final StatefulSetListItemsSpecTemplateSpecInitContainersResources resources,
                                                              final StatefulSetListItemsSpecTemplateSpecInitContainersSecurityContext securityContext,
                                                              final StatefulSetListItemsSpecTemplateSpecInitContainersStartupProbe startupProbe,
                                                              final Boolean stdin,
                                                              final Boolean stdinOnce,
                                                              final String terminationMessagePath,
                                                              final String terminationMessagePolicy,
                                                              final Boolean tty,
                                                              final List<StatefulSetListItemsSpecTemplateSpecInitContainersVolumeDevices> volumeDevices,
                                                              final List<StatefulSetListItemsSpecTemplateSpecInitContainersVolumeMounts> volumeMounts,
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

    public List<StatefulSetListItemsSpecTemplateSpecInitContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<StatefulSetListItemsSpecTemplateSpecInitContainersEnv> env) {
        this.env = env;
    }

    public List<StatefulSetListItemsSpecTemplateSpecInitContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<StatefulSetListItemsSpecTemplateSpecInitContainersEnvFrom> envFrom) {
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

    public StatefulSetListItemsSpecTemplateSpecInitContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final StatefulSetListItemsSpecTemplateSpecInitContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final StatefulSetListItemsSpecTemplateSpecInitContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<StatefulSetListItemsSpecTemplateSpecInitContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<StatefulSetListItemsSpecTemplateSpecInitContainersPorts> ports) {
        this.ports = ports;
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final StatefulSetListItemsSpecTemplateSpecInitContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersResources getResources() {
        return resources;
    }

    public void setResources(final StatefulSetListItemsSpecTemplateSpecInitContainersResources resources) {
        this.resources = resources;
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final StatefulSetListItemsSpecTemplateSpecInitContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final StatefulSetListItemsSpecTemplateSpecInitContainersStartupProbe startupProbe) {
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

    public List<StatefulSetListItemsSpecTemplateSpecInitContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<StatefulSetListItemsSpecTemplateSpecInitContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<StatefulSetListItemsSpecTemplateSpecInitContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<StatefulSetListItemsSpecTemplateSpecInitContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecInitContainers)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecInitContainers __otherCasted = (StatefulSetListItemsSpecTemplateSpecInitContainers) __other;
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
