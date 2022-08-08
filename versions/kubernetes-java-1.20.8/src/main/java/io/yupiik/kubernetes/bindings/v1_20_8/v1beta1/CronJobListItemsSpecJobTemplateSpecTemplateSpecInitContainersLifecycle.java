package io.yupiik.kubernetes.bindings.v1_20_8.v1beta1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecycle {
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStart postStart;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStop preStop;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecycle() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecycle(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStart postStart,
                                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStart postStart) {
        this.postStart = postStart;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStop preStop) {
        this.preStop = preStop;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                postStart,
                preStop);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecycle)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecycle __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }
}
