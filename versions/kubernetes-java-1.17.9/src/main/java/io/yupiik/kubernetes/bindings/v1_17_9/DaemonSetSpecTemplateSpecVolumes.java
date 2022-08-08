package io.yupiik.kubernetes.bindings.v1_17_9;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecVolumes {
    private DaemonSetSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore;
    private DaemonSetSpecTemplateSpecVolumesAzureDisk azureDisk;
    private DaemonSetSpecTemplateSpecVolumesAzureFile azureFile;
    private DaemonSetSpecTemplateSpecVolumesCephfs cephfs;
    private DaemonSetSpecTemplateSpecVolumesCinder cinder;
    private DaemonSetSpecTemplateSpecVolumesConfigMap configMap;
    private DaemonSetSpecTemplateSpecVolumesCsi csi;
    private DaemonSetSpecTemplateSpecVolumesDownwardAPI downwardAPI;
    private DaemonSetSpecTemplateSpecVolumesEmptyDir emptyDir;
    private DaemonSetSpecTemplateSpecVolumesFc fc;
    private DaemonSetSpecTemplateSpecVolumesFlexVolume flexVolume;
    private DaemonSetSpecTemplateSpecVolumesFlocker flocker;
    private DaemonSetSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk;
    private DaemonSetSpecTemplateSpecVolumesGitRepo gitRepo;
    private DaemonSetSpecTemplateSpecVolumesGlusterfs glusterfs;
    private DaemonSetSpecTemplateSpecVolumesHostPath hostPath;
    private DaemonSetSpecTemplateSpecVolumesIscsi iscsi;
    private String name;
    private DaemonSetSpecTemplateSpecVolumesNfs nfs;
    private DaemonSetSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim;
    private DaemonSetSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk;
    private DaemonSetSpecTemplateSpecVolumesPortworxVolume portworxVolume;
    private DaemonSetSpecTemplateSpecVolumesProjected projected;
    private DaemonSetSpecTemplateSpecVolumesQuobyte quobyte;
    private DaemonSetSpecTemplateSpecVolumesRbd rbd;
    private DaemonSetSpecTemplateSpecVolumesScaleIO scaleIO;
    private DaemonSetSpecTemplateSpecVolumesSecret secret;
    private DaemonSetSpecTemplateSpecVolumesStorageos storageos;
    private DaemonSetSpecTemplateSpecVolumesVsphereVolume vsphereVolume;

    public DaemonSetSpecTemplateSpecVolumes() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumes(final DaemonSetSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore,
                                            final DaemonSetSpecTemplateSpecVolumesAzureDisk azureDisk,
                                            final DaemonSetSpecTemplateSpecVolumesAzureFile azureFile,
                                            final DaemonSetSpecTemplateSpecVolumesCephfs cephfs,
                                            final DaemonSetSpecTemplateSpecVolumesCinder cinder,
                                            final DaemonSetSpecTemplateSpecVolumesConfigMap configMap,
                                            final DaemonSetSpecTemplateSpecVolumesCsi csi,
                                            final DaemonSetSpecTemplateSpecVolumesDownwardAPI downwardAPI,
                                            final DaemonSetSpecTemplateSpecVolumesEmptyDir emptyDir,
                                            final DaemonSetSpecTemplateSpecVolumesFc fc,
                                            final DaemonSetSpecTemplateSpecVolumesFlexVolume flexVolume,
                                            final DaemonSetSpecTemplateSpecVolumesFlocker flocker,
                                            final DaemonSetSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk,
                                            final DaemonSetSpecTemplateSpecVolumesGitRepo gitRepo,
                                            final DaemonSetSpecTemplateSpecVolumesGlusterfs glusterfs,
                                            final DaemonSetSpecTemplateSpecVolumesHostPath hostPath,
                                            final DaemonSetSpecTemplateSpecVolumesIscsi iscsi,
                                            final String name,
                                            final DaemonSetSpecTemplateSpecVolumesNfs nfs,
                                            final DaemonSetSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim,
                                            final DaemonSetSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk,
                                            final DaemonSetSpecTemplateSpecVolumesPortworxVolume portworxVolume,
                                            final DaemonSetSpecTemplateSpecVolumesProjected projected,
                                            final DaemonSetSpecTemplateSpecVolumesQuobyte quobyte,
                                            final DaemonSetSpecTemplateSpecVolumesRbd rbd,
                                            final DaemonSetSpecTemplateSpecVolumesScaleIO scaleIO,
                                            final DaemonSetSpecTemplateSpecVolumesSecret secret,
                                            final DaemonSetSpecTemplateSpecVolumesStorageos storageos,
                                            final DaemonSetSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumesAwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(final DaemonSetSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    public DaemonSetSpecTemplateSpecVolumesAzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(final DaemonSetSpecTemplateSpecVolumesAzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    public DaemonSetSpecTemplateSpecVolumesAzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(final DaemonSetSpecTemplateSpecVolumesAzureFile azureFile) {
        this.azureFile = azureFile;
    }

    public DaemonSetSpecTemplateSpecVolumesCephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(final DaemonSetSpecTemplateSpecVolumesCephfs cephfs) {
        this.cephfs = cephfs;
    }

    public DaemonSetSpecTemplateSpecVolumesCinder getCinder() {
        return cinder;
    }

    public void setCinder(final DaemonSetSpecTemplateSpecVolumesCinder cinder) {
        this.cinder = cinder;
    }

    public DaemonSetSpecTemplateSpecVolumesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final DaemonSetSpecTemplateSpecVolumesConfigMap configMap) {
        this.configMap = configMap;
    }

    public DaemonSetSpecTemplateSpecVolumesCsi getCsi() {
        return csi;
    }

    public void setCsi(final DaemonSetSpecTemplateSpecVolumesCsi csi) {
        this.csi = csi;
    }

    public DaemonSetSpecTemplateSpecVolumesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final DaemonSetSpecTemplateSpecVolumesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public DaemonSetSpecTemplateSpecVolumesEmptyDir getEmptyDir() {
        return emptyDir;
    }

    public void setEmptyDir(final DaemonSetSpecTemplateSpecVolumesEmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    public DaemonSetSpecTemplateSpecVolumesFc getFc() {
        return fc;
    }

    public void setFc(final DaemonSetSpecTemplateSpecVolumesFc fc) {
        this.fc = fc;
    }

    public DaemonSetSpecTemplateSpecVolumesFlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(final DaemonSetSpecTemplateSpecVolumesFlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    public DaemonSetSpecTemplateSpecVolumesFlocker getFlocker() {
        return flocker;
    }

    public void setFlocker(final DaemonSetSpecTemplateSpecVolumesFlocker flocker) {
        this.flocker = flocker;
    }

    public DaemonSetSpecTemplateSpecVolumesGcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(final DaemonSetSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    public DaemonSetSpecTemplateSpecVolumesGitRepo getGitRepo() {
        return gitRepo;
    }

    public void setGitRepo(final DaemonSetSpecTemplateSpecVolumesGitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    public DaemonSetSpecTemplateSpecVolumesGlusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(final DaemonSetSpecTemplateSpecVolumesGlusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    public DaemonSetSpecTemplateSpecVolumesHostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(final DaemonSetSpecTemplateSpecVolumesHostPath hostPath) {
        this.hostPath = hostPath;
    }

    public DaemonSetSpecTemplateSpecVolumesIscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(final DaemonSetSpecTemplateSpecVolumesIscsi iscsi) {
        this.iscsi = iscsi;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public DaemonSetSpecTemplateSpecVolumesNfs getNfs() {
        return nfs;
    }

    public void setNfs(final DaemonSetSpecTemplateSpecVolumesNfs nfs) {
        this.nfs = nfs;
    }

    public DaemonSetSpecTemplateSpecVolumesPersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(final DaemonSetSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    public DaemonSetSpecTemplateSpecVolumesPhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(final DaemonSetSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    public DaemonSetSpecTemplateSpecVolumesPortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(final DaemonSetSpecTemplateSpecVolumesPortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    public DaemonSetSpecTemplateSpecVolumesProjected getProjected() {
        return projected;
    }

    public void setProjected(final DaemonSetSpecTemplateSpecVolumesProjected projected) {
        this.projected = projected;
    }

    public DaemonSetSpecTemplateSpecVolumesQuobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(final DaemonSetSpecTemplateSpecVolumesQuobyte quobyte) {
        this.quobyte = quobyte;
    }

    public DaemonSetSpecTemplateSpecVolumesRbd getRbd() {
        return rbd;
    }

    public void setRbd(final DaemonSetSpecTemplateSpecVolumesRbd rbd) {
        this.rbd = rbd;
    }

    public DaemonSetSpecTemplateSpecVolumesScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(final DaemonSetSpecTemplateSpecVolumesScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    public DaemonSetSpecTemplateSpecVolumesSecret getSecret() {
        return secret;
    }

    public void setSecret(final DaemonSetSpecTemplateSpecVolumesSecret secret) {
        this.secret = secret;
    }

    public DaemonSetSpecTemplateSpecVolumesStorageos getStorageos() {
        return storageos;
    }

    public void setStorageos(final DaemonSetSpecTemplateSpecVolumesStorageos storageos) {
        this.storageos = storageos;
    }

    public DaemonSetSpecTemplateSpecVolumesVsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(final DaemonSetSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
        this.vsphereVolume = vsphereVolume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                awsElasticBlockStore,
                azureDisk,
                azureFile,
                cephfs,
                cinder,
                configMap,
                csi,
                downwardAPI,
                emptyDir,
                fc,
                flexVolume,
                flocker,
                gcePersistentDisk,
                gitRepo,
                glusterfs,
                hostPath,
                iscsi,
                name,
                nfs,
                persistentVolumeClaim,
                photonPersistentDisk,
                portworxVolume,
                projected,
                quobyte,
                rbd,
                scaleIO,
                secret,
                storageos,
                vsphereVolume);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSetSpecTemplateSpecVolumes)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecVolumes __otherCasted = (DaemonSetSpecTemplateSpecVolumes) __other;
        return Objects.equals(awsElasticBlockStore, __otherCasted.awsElasticBlockStore) &&
            Objects.equals(azureDisk, __otherCasted.azureDisk) &&
            Objects.equals(azureFile, __otherCasted.azureFile) &&
            Objects.equals(cephfs, __otherCasted.cephfs) &&
            Objects.equals(cinder, __otherCasted.cinder) &&
            Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(csi, __otherCasted.csi) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(emptyDir, __otherCasted.emptyDir) &&
            Objects.equals(fc, __otherCasted.fc) &&
            Objects.equals(flexVolume, __otherCasted.flexVolume) &&
            Objects.equals(flocker, __otherCasted.flocker) &&
            Objects.equals(gcePersistentDisk, __otherCasted.gcePersistentDisk) &&
            Objects.equals(gitRepo, __otherCasted.gitRepo) &&
            Objects.equals(glusterfs, __otherCasted.glusterfs) &&
            Objects.equals(hostPath, __otherCasted.hostPath) &&
            Objects.equals(iscsi, __otherCasted.iscsi) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(nfs, __otherCasted.nfs) &&
            Objects.equals(persistentVolumeClaim, __otherCasted.persistentVolumeClaim) &&
            Objects.equals(photonPersistentDisk, __otherCasted.photonPersistentDisk) &&
            Objects.equals(portworxVolume, __otherCasted.portworxVolume) &&
            Objects.equals(projected, __otherCasted.projected) &&
            Objects.equals(quobyte, __otherCasted.quobyte) &&
            Objects.equals(rbd, __otherCasted.rbd) &&
            Objects.equals(scaleIO, __otherCasted.scaleIO) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(storageos, __otherCasted.storageos) &&
            Objects.equals(vsphereVolume, __otherCasted.vsphereVolume);
    }
}
