package io.yupiik.kubernetes.bindings.v1_18_13.v1alpha1;

import java.util.List;
import java.util.Objects;

public class PodPresetListItemsSpec {
    private List<PodPresetListItemsSpecEnv> env;
    private List<PodPresetListItemsSpecEnvFrom> envFrom;
    private PodPresetListItemsSpecSelector selector;
    private List<PodPresetListItemsSpecVolumeMounts> volumeMounts;
    private List<PodPresetListItemsSpecVolumes> volumes;

    public PodPresetListItemsSpec() {
        // no-op
    }

    public PodPresetListItemsSpec(final List<PodPresetListItemsSpecEnv> env,
                                  final List<PodPresetListItemsSpecEnvFrom> envFrom,
                                  final PodPresetListItemsSpecSelector selector,
                                  final List<PodPresetListItemsSpecVolumeMounts> volumeMounts,
                                  final List<PodPresetListItemsSpecVolumes> volumes) {
        // no-op
    }

    public List<PodPresetListItemsSpecEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<PodPresetListItemsSpecEnv> env) {
        this.env = env;
    }

    public List<PodPresetListItemsSpecEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<PodPresetListItemsSpecEnvFrom> envFrom) {
        this.envFrom = envFrom;
    }

    public PodPresetListItemsSpecSelector getSelector() {
        return selector;
    }

    public void setSelector(final PodPresetListItemsSpecSelector selector) {
        this.selector = selector;
    }

    public List<PodPresetListItemsSpecVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<PodPresetListItemsSpecVolumeMounts> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }

    public List<PodPresetListItemsSpecVolumes> getVolumes() {
        return volumes;
    }

    public void setVolumes(final List<PodPresetListItemsSpecVolumes> volumes) {
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
        if (!(__other instanceof PodPresetListItemsSpec)) {
            return false;
        }
        final PodPresetListItemsSpec __otherCasted = (PodPresetListItemsSpec) __other;
        return Objects.equals(env, __otherCasted.env) &&
            Objects.equals(envFrom, __otherCasted.envFrom) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(volumeMounts, __otherCasted.volumeMounts) &&
            Objects.equals(volumes, __otherCasted.volumes);
    }
}
