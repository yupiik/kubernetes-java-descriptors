package io.yupiik.kubernetes.bindings.v1_17_7;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStart {
    private CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartExec exec;
    private CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet;
    private CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket;

    public CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStart() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStart(final CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartExec exec,
                                                                              final CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet,
                                                                              final CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStart)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStart __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
