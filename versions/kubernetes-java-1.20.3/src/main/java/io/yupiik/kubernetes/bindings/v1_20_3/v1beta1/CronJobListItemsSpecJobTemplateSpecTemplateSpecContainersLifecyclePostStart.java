package io.yupiik.kubernetes.bindings.v1_20_3.v1beta1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStart {
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartExec exec;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStart() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStart(final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartExec exec,
                                                                                       final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet,
                                                                                       final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStart)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStart __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
