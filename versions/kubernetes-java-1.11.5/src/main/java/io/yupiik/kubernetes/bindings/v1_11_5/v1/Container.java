package io.yupiik.kubernetes.bindings.v1_11_5.v1;

import io.yupiik.kubernetes.bindings.v1_11_5.Validable;
import io.yupiik.kubernetes.bindings.v1_11_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Container implements Validable<Container> {
    private List<String> args;
    private List<String> command;
    private List<EnvVar> env;
    private List<EnvFromSource> envFrom;
    private String image;
    private String imagePullPolicy;
    private Lifecycle lifecycle;
    private Probe livenessProbe;
    private String name;
    private List<ContainerPort> ports;
    private Probe readinessProbe;
    private ResourceRequirements resources;
    private SecurityContext securityContext;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<VolumeDevice> volumeDevices;
    private List<VolumeMount> volumeMounts;
    private String workingDir;

    public Container() {
        // no-op
    }

    public Container(final List<String> args,
                     final List<String> command,
                     final List<EnvVar> env,
                     final List<EnvFromSource> envFrom,
                     final String image,
                     final String imagePullPolicy,
                     final Lifecycle lifecycle,
                     final Probe livenessProbe,
                     final String name,
                     final List<ContainerPort> ports,
                     final Probe readinessProbe,
                     final ResourceRequirements resources,
                     final SecurityContext securityContext,
                     final Boolean stdin,
                     final Boolean stdinOnce,
                     final String terminationMessagePath,
                     final String terminationMessagePolicy,
                     final Boolean tty,
                     final List<VolumeDevice> volumeDevices,
                     final List<VolumeMount> volumeMounts,
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

    public List<EnvVar> getEnv() {
        return env;
    }

    public void setEnv(final List<EnvVar> env) {
        this.env = env;
    }

    public List<EnvFromSource> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<EnvFromSource> envFrom) {
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

    public Lifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(final Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public Probe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(final Probe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<ContainerPort> getPorts() {
        return ports;
    }

    public void setPorts(final List<ContainerPort> ports) {
        this.ports = ports;
    }

    public Probe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(final Probe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public ResourceRequirements getResources() {
        return resources;
    }

    public void setResources(final ResourceRequirements resources) {
        this.resources = resources;
    }

    public SecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(final SecurityContext securityContext) {
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

    public List<VolumeDevice> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(final List<VolumeDevice> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<VolumeMount> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<VolumeMount> volumeMounts) {
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
        if (!(__other instanceof Container)) {
            return false;
        }
        final Container __otherCasted = (Container) __other;
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

    public Container args(final List<String> args) {
        this.args = args;
        return this;
    }

    public Container command(final List<String> command) {
        this.command = command;
        return this;
    }

    public Container env(final List<EnvVar> env) {
        this.env = env;
        return this;
    }

    public Container envFrom(final List<EnvFromSource> envFrom) {
        this.envFrom = envFrom;
        return this;
    }

    public Container image(final String image) {
        this.image = image;
        return this;
    }

    public Container imagePullPolicy(final String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
        return this;
    }

    public Container lifecycle(final Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    public Container livenessProbe(final Probe livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }

    public Container name(final String name) {
        this.name = name;
        return this;
    }

    public Container ports(final List<ContainerPort> ports) {
        this.ports = ports;
        return this;
    }

    public Container readinessProbe(final Probe readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }

    public Container resources(final ResourceRequirements resources) {
        this.resources = resources;
        return this;
    }

    public Container securityContext(final SecurityContext securityContext) {
        this.securityContext = securityContext;
        return this;
    }

    public Container stdin(final Boolean stdin) {
        this.stdin = stdin;
        return this;
    }

    public Container stdinOnce(final Boolean stdinOnce) {
        this.stdinOnce = stdinOnce;
        return this;
    }

    public Container terminationMessagePath(final String terminationMessagePath) {
        this.terminationMessagePath = terminationMessagePath;
        return this;
    }

    public Container terminationMessagePolicy(final String terminationMessagePolicy) {
        this.terminationMessagePolicy = terminationMessagePolicy;
        return this;
    }

    public Container tty(final Boolean tty) {
        this.tty = tty;
        return this;
    }

    public Container volumeDevices(final List<VolumeDevice> volumeDevices) {
        this.volumeDevices = volumeDevices;
        return this;
    }

    public Container volumeMounts(final List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
        return this;
    }

    public Container workingDir(final String workingDir) {
        this.workingDir = workingDir;
        return this;
    }

    @Override
    public Container validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
