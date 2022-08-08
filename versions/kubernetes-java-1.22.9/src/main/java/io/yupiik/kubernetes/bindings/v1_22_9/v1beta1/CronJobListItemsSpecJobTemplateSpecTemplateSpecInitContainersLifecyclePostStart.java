package io.yupiik.kubernetes.bindings.v1_22_9.v1beta1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStart {
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartExec exec;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStart() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStart(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartExec exec,
                                                                                           final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet,
                                                                                           final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                exec,
                httpGet,
                tcpSocket);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStart)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStart __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
