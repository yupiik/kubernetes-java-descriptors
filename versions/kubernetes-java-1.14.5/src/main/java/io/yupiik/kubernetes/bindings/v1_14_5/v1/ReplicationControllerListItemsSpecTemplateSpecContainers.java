package io.yupiik.kubernetes.bindings.v1_14_5.v1;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecContainers {
    private List<String> args;
    private List<String> command;
    private List<ReplicationControllerListItemsSpecTemplateSpecContainersEnv> env;
    private List<ReplicationControllerListItemsSpecTemplateSpecContainersEnvFrom> envFrom;
    private String image;
    private String imagePullPolicy;
    private ReplicationControllerListItemsSpecTemplateSpecContainersLifecycle lifecycle;
    private ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbe livenessProbe;
    private String name;
    private List<ReplicationControllerListItemsSpecTemplateSpecContainersPorts> ports;
    private ReplicationControllerListItemsSpecTemplateSpecContainersReadinessProbe readinessProbe;
    private ReplicationControllerListItemsSpecTemplateSpecContainersResources resources;
    private ReplicationControllerListItemsSpecTemplateSpecContainersSecurityContext securityContext;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<ReplicationControllerListItemsSpecTemplateSpecContainersVolumeDevices> volumeDevices;
    private List<ReplicationControllerListItemsSpecTemplateSpecContainersVolumeMounts> volumeMounts;
    private String workingDir;

    public ReplicationControllerListItemsSpecTemplateSpecContainers() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainers(final List<String> args,
                                                                    final List<String> command,
                                                                    final List<ReplicationControllerListItemsSpecTemplateSpecContainersEnv> env,
                                                                    final List<ReplicationControllerListItemsSpecTemplateSpecContainersEnvFrom> envFrom,
                                                                    final String image,
                                                                    final String imagePullPolicy,
                                                                    final ReplicationControllerListItemsSpecTemplateSpecContainersLifecycle lifecycle,
                                                                    final ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbe livenessProbe,
                                                                    final String name,
                                                                    final List<ReplicationControllerListItemsSpecTemplateSpecContainersPorts> ports,
                                                                    final ReplicationControllerListItemsSpecTemplateSpecContainersReadinessProbe readinessProbe,
                                                                    final ReplicationControllerListItemsSpecTemplateSpecContainersResources resources,
                                                                    final ReplicationControllerListItemsSpecTemplateSpecContainersSecurityContext securityContext,
                                                                    final Boolean stdin,
                                                                    final Boolean stdinOnce,
                                                                    final String terminationMessagePath,
                                                                    final String terminationMessagePolicy,
                                                                    final Boolean tty,
                                                                    final List<ReplicationControllerListItemsSpecTemplateSpecContainersVolumeDevices> volumeDevices,
                                                                    final List<ReplicationControllerListItemsSpecTemplateSpecContainersVolumeMounts> volumeMounts,
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

    public List<ReplicationControllerListItemsSpecTemplateSpecContainersEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<ReplicationControllerListItemsSpecTemplateSpecContainersEnv> env) {
        this.env = env;
    }

    public List<ReplicationControllerListItemsSpecTemplateSpecContainersEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<ReplicationControllerListItemsSpecTemplateSpecContainersEnvFrom> envFrom) {
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

    public ReplicationControllerListItemsSpecTemplateSpecContainersLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final ReplicationControllerListItemsSpecTemplateSpecContainersLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<ReplicationControllerListItemsSpecTemplateSpecContainersPorts> getPorts() {
        return ports;
    }

    public void setPorts(final List<ReplicationControllerListItemsSpecTemplateSpecContainersPorts> ports) {
        this.ports = ports;
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final ReplicationControllerListItemsSpecTemplateSpecContainersReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersResources getResources() {
        return resources;
    }

    public void setResources(final ReplicationControllerListItemsSpecTemplateSpecContainersResources resources) {
        this.resources = resources;
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final ReplicationControllerListItemsSpecTemplateSpecContainersSecurityContext securityContext) {
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

    public List<ReplicationControllerListItemsSpecTemplateSpecContainersVolumeDevices> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<ReplicationControllerListItemsSpecTemplateSpecContainersVolumeDevices> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<ReplicationControllerListItemsSpecTemplateSpecContainersVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<ReplicationControllerListItemsSpecTemplateSpecContainersVolumeMounts> volumeMounts) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecContainers)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecContainers __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecContainers) __other;
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
