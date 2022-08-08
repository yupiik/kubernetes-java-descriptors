package io.yupiik.kubernetes.bindings.v1_16_0.v1beta1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecVolumes {
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesAzureDisk azureDisk;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesAzureFile azureFile;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesCephfs cephfs;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesCinder cinder;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesConfigMap configMap;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesCsi csi;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPI downwardAPI;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesEmptyDir emptyDir;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesFc fc;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesFlexVolume flexVolume;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesFlocker flocker;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesGitRepo gitRepo;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesGlusterfs glusterfs;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesHostPath hostPath;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesIscsi iscsi;
    private String name;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesNfs nfs;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesPortworxVolume portworxVolume;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesProjected projected;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesQuobyte quobyte;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesRbd rbd;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesScaleIO scaleIO;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesSecret secret;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesStorageos storageos;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesVsphereVolume vsphereVolume;

    public CronJobSpecJobTemplateSpecTemplateSpecVolumes() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumes(final CronJobSpecJobTemplateSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore,
                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesAzureDisk azureDisk,
                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesAzureFile azureFile,
                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesCephfs cephfs,
                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesCinder cinder,
                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesConfigMap configMap,
                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesCsi csi,
                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPI downwardAPI,
                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesEmptyDir emptyDir,
                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesFc fc,
                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesFlexVolume flexVolume,
                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesFlocker flocker,
                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk,
                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesGitRepo gitRepo,
                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesGlusterfs glusterfs,
                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesHostPath hostPath,
                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesIscsi iscsi,
                                                         final String name,
                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesNfs nfs,
                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim,
                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk,
                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesPortworxVolume portworxVolume,
                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesProjected projected,
                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesQuobyte quobyte,
                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesRbd rbd,
                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesScaleIO scaleIO,
                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesSecret secret,
                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesStorageos storageos,
                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesAwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(final CronJobSpecJobTemplateSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesAzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(final CronJobSpecJobTemplateSpecTemplateSpecVolumesAzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesAzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(final CronJobSpecJobTemplateSpecTemplateSpecVolumesAzureFile azureFile) {
        this.azureFile = azureFile;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesCephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(final CronJobSpecJobTemplateSpecTemplateSpecVolumesCephfs cephfs) {
        this.cephfs = cephfs;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesCinder getCinder() {
        return cinder;
    }

    public void setCinder(final CronJobSpecJobTemplateSpecTemplateSpecVolumesCinder cinder) {
        this.cinder = cinder;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final CronJobSpecJobTemplateSpecTemplateSpecVolumesConfigMap configMap) {
        this.configMap = configMap;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesCsi getCsi() {
        return csi;
    }

    public void setCsi(final CronJobSpecJobTemplateSpecTemplateSpecVolumesCsi csi) {
        this.csi = csi;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesEmptyDir getEmptyDir() {
        return emptyDir;
    }

    public void setEmptyDir(final CronJobSpecJobTemplateSpecTemplateSpecVolumesEmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesFc getFc() {
        return fc;
    }

    public void setFc(final CronJobSpecJobTemplateSpecTemplateSpecVolumesFc fc) {
        this.fc = fc;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesFlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(final CronJobSpecJobTemplateSpecTemplateSpecVolumesFlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesFlocker getFlocker() {
        return flocker;
    }

    public void setFlocker(final CronJobSpecJobTemplateSpecTemplateSpecVolumesFlocker flocker) {
        this.flocker = flocker;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesGcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(final CronJobSpecJobTemplateSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesGitRepo getGitRepo() {
        return gitRepo;
    }

    public void setGitRepo(final CronJobSpecJobTemplateSpecTemplateSpecVolumesGitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesGlusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(final CronJobSpecJobTemplateSpecTemplateSpecVolumesGlusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesHostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(final CronJobSpecJobTemplateSpecTemplateSpecVolumesHostPath hostPath) {
        this.hostPath = hostPath;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesIscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(final CronJobSpecJobTemplateSpecTemplateSpecVolumesIscsi iscsi) {
        this.iscsi = iscsi;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesNfs getNfs() {
        return nfs;
    }

    public void setNfs(final CronJobSpecJobTemplateSpecTemplateSpecVolumesNfs nfs) {
        this.nfs = nfs;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesPersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(final CronJobSpecJobTemplateSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesPhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(final CronJobSpecJobTemplateSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesPortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(final CronJobSpecJobTemplateSpecTemplateSpecVolumesPortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesProjected getProjected() {
        return projected;
    }

    public void setProjected(final CronJobSpecJobTemplateSpecTemplateSpecVolumesProjected projected) {
        this.projected = projected;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesQuobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(final CronJobSpecJobTemplateSpecTemplateSpecVolumesQuobyte quobyte) {
        this.quobyte = quobyte;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesRbd getRbd() {
        return rbd;
    }

    public void setRbd(final CronJobSpecJobTemplateSpecTemplateSpecVolumesRbd rbd) {
        this.rbd = rbd;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(final CronJobSpecJobTemplateSpecTemplateSpecVolumesScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesSecret getSecret() {
        return secret;
    }

    public void setSecret(final CronJobSpecJobTemplateSpecTemplateSpecVolumesSecret secret) {
        this.secret = secret;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesStorageos getStorageos() {
        return storageos;
    }

    public void setStorageos(final CronJobSpecJobTemplateSpecTemplateSpecVolumesStorageos storageos) {
        this.storageos = storageos;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesVsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(final CronJobSpecJobTemplateSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecVolumes)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecVolumes __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecVolumes) __other;
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
