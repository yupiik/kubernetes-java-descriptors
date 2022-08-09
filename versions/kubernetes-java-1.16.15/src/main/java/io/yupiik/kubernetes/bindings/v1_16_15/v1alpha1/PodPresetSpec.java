package io.yupiik.kubernetes.bindings.v1_16_15.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_16_15.Exportable;
import io.yupiik.kubernetes.bindings.v1_16_15.Validable;
import io.yupiik.kubernetes.bindings.v1_16_15.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodPresetSpec implements Validable<PodPresetSpec>, Exportable {
    private List<EnvVar> env;
    private List<EnvFromSource> envFrom;
    private LabelSelector selector;
    private List<VolumeMount> volumeMounts;
    private List<Volume> volumes;

    public PodPresetSpec() {
        // no-op
    }

    public PodPresetSpec(final List<EnvVar> env,
                         final List<EnvFromSource> envFrom,
                         final LabelSelector selector,
                         final List<VolumeMount> volumeMounts,
                         final List<Volume> volumes) {
        // no-op
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

    public LabelSelector getSelector() {
        return selector;
    }

    public void setSelector(final LabelSelector selector) {
        this.selector = selector;
    }

    public List<VolumeMount> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }

    public List<Volume> getVolumes() {
        return volumes;
    }

    public void setVolumes(final List<Volume> volumes) {
        this.volumes = volumes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                env,
                envFrom,
                selector,
                volumeMounts,
                volumes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodPresetSpec)) {
            return false;
        }
        final PodPresetSpec __otherCasted = (PodPresetSpec) __other;
        return Objects.equals(env, __otherCasted.env) &&
            Objects.equals(envFrom, __otherCasted.envFrom) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(volumeMounts, __otherCasted.volumeMounts) &&
            Objects.equals(volumes, __otherCasted.volumes);
    }

    public PodPresetSpec env(final List<EnvVar> env) {
        this.env = env;
        return this;
    }

    public PodPresetSpec envFrom(final List<EnvFromSource> envFrom) {
        this.envFrom = envFrom;
        return this;
    }

    public PodPresetSpec selector(final LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    public PodPresetSpec volumeMounts(final List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
        return this;
    }

    public PodPresetSpec volumes(final List<Volume> volumes) {
        this.volumes = volumes;
        return this;
    }

    @Override
    public PodPresetSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (env != null ? "\"env\":" + env.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (envFrom != null ? "\"envFrom\":" + envFrom.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (selector != null ? "\"selector\":" + selector.asJson() : ""),
                    (volumeMounts != null ? "\"volumeMounts\":" + volumeMounts.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (volumes != null ? "\"volumes\":" + volumes.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
