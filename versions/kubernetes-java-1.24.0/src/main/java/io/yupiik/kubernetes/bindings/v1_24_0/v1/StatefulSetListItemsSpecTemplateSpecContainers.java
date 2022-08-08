package io.yupiik.kubernetes.bindings.v1_24_0.v1;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecContainers {
    private List<String> args;
    private List<String> command;
    private List<StatefulSetListItemsSpecTemplateSpecContainersEnv> env;
    private List<StatefulSetListItemsSpecTemplateSpecContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private StatefulSetListItemsSpecTemplateSpecContainersLifecycle lifecycle;
    private StatefulSetListItemsSpecTemplateSpecContainersLivenessProbe livenessProbe;
    private String name;
    private List<StatefulSetListItemsSpecTemplateSpecContainersPorts> ports;
    private StatefulSetListItemsSpecTemplateSpecContainersReadinessProbe readinessProbe;
    private StatefulSetListItemsSpecTemplateSpecContainersResources resources;
    private StatefulSetListItemsSpecTemplateSpecContainersSecurityContext securityContext;
    private StatefulSetListItemsSpecTemplateSpecContainersStartupProbe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<StatefulSetListItemsSpecTemplateSpecContainersVolumeDevices> volumeDevices;
    private List<StatefulSetListItemsSpecTemplateSpecContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public StatefulSetListItemsSpecTemplateSpecContainers() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecContainers(final List<String> args,
                                                          final List<String> command,
                                                          final List<StatefulSetListItemsSpecTemplateSpecContainersEnv> env,
                                                          final List<StatefulSetListItemsSpecTemplateSpecContainersEnvFrom> envFrom,
                                                          final String image,
                                                          final String imagePullPolicy,
                                                          final StatefulSetListItemsSpecTemplateSpecContainersLifecycle lifecycle,
                                                          final StatefulSetListItemsSpecTemplateSpecContainersLivenessProbe livenessProbe,
                                                          final String name,
                                                          final List<StatefulSetListItemsSpecTemplateSpecContainersPorts> ports,
                                                          final StatefulSetListItemsSpecTemplateSpecContainersReadinessProbe readinessProbe,
                                                          final StatefulSetListItemsSpecTemplateSpecContainersResources resources,
                                                          final StatefulSetListItemsSpecTemplateSpecContainersSecurityContext securityContext,
                                                          final StatefulSetListItemsSpecTemplateSpecContainersStartupProbe startupProbe,
                                                          final Boolean stdin,
                                                          final Boolean stdinOnce,
                                                          final String terminationMessagePath,
                                                          final String terminationMessagePolicy,
                                                          final Boolean tty,
                                                          final List<StatefulSetListItemsSpecTemplateSpecContainersVolumeDevices> volumeDevices,
                                                          final List<StatefulSetListItemsSpecTemplateSpecContainersVolumeMounts> volumeMounts,
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

    public List<StatefulSetListItemsSpecTemplateSpecContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<StatefulSetListItemsSpecTemplateSpecContainersEnv> env) {
        this.env = env;
    }

    public List<StatefulSetListItemsSpecTemplateSpecContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<StatefulSetListItemsSpecTemplateSpecContainersEnvFrom> envFrom) {
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

    public StatefulSetListItemsSpecTemplateSpecContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final StatefulSetListItemsSpecTemplateSpecContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public StatefulSetListItemsSpecTemplateSpecContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final StatefulSetListItemsSpecTemplateSpecContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<StatefulSetListItemsSpecTemplateSpecContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<StatefulSetListItemsSpecTemplateSpecContainersPorts> ports) {
        this.ports = ports;
    }

    public StatefulSetListItemsSpecTemplateSpecContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final StatefulSetListItemsSpecTemplateSpecContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public StatefulSetListItemsSpecTemplateSpecContainersResources getResources() {
        return resources;
    }

    public void setResources(final StatefulSetListItemsSpecTemplateSpecContainersResources resources) {
        this.resources = resources;
    }

    public StatefulSetListItemsSpecTemplateSpecContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final StatefulSetListItemsSpecTemplateSpecContainersSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public StatefulSetListItemsSpecTemplateSpecContainersStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(final StatefulSetListItemsSpecTemplateSpecContainersStartupProbe startupProbe) {
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

    public List<StatefulSetListItemsSpecTemplateSpecContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<StatefulSetListItemsSpecTemplateSpecContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<StatefulSetListItemsSpecTemplateSpecContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<StatefulSetListItemsSpecTemplateSpecContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecContainers)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecContainers __otherCasted = (StatefulSetListItemsSpecTemplateSpecContainers) __other;
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
