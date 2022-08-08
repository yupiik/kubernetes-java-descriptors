package io.yupiik.kubernetes.bindings.v1_15_12;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStart {
    private CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartExec exec;
    private CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet;
    private CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket;

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStart() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStart(final CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartExec exec,
                                                                                  final CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet,
                                                                                  final CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStart)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStart __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
