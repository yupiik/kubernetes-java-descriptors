package io.yupiik.kubernetes.bindings.v1_16_11;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStop {
    private CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopExec exec;
    private CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet;
    private CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket;

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStop() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStop(final CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopExec exec,
                                                                                final CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet,
                                                                                final CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStop)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStop __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
