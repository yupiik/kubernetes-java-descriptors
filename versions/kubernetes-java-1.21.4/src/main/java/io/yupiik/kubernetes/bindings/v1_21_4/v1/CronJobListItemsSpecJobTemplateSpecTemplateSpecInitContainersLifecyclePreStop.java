package io.yupiik.kubernetes.bindings.v1_21_4.v1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStop {
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopExec exec;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStop() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStop(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopExec exec,
                                                                                         final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet,
                                                                                         final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStop)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStop __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
