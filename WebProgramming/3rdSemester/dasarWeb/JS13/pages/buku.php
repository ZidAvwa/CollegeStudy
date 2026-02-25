<section class="content-header">
    <div class="container-fluid">
        <div class="row mb-2">
            <div class="col-sm-6"><h1>Daftar Buku</h1></div>
            <div class="col-sm-6">
                <ol class="breadcrumb float-sm-right">
                    <li class="breadcrumb-item"><a href="#">Home</a></li>
                    <li class="breadcrumb-item active">Buku</li>
                </ol>
            </div>
        </div>
    </div>
</section>

<section class="content">
    <div class="card">
        <div class="card-header">
            <h3 class="card-title">Daftar Buku</h3>
            <div class="card-tools">
                <button type="button" class="btn btn-md btn-primary" onclick="tambahData()">Tambah</button>
            </div>
        </div>
        <div class="card-body">
            <table class="table table-sm table-bordered table-striped" id="table-data">
                <thead>
                    <tr>
                        <th>No</th>
                        <th>Kode</th>
                        <th>Judul</th>
                        <th>Jumlah</th>
                        <th>Deskripsi</th>
                        <th>Aksi</th>
                    </tr>
                </thead>
                <tbody></tbody>
            </table>
        </div>
    </div>
</section>

<div class="modal fade" id="form-data" style="display: none;" aria-hidden="true">
    <form action="action/bukuAction.php?act=save" method="post" id="form-tambah">
    <div class="modal-dialog modal-md">
        <div class="modal-content">
            <div class="modal-header"><h4 class="modal-title">Form Buku</h4></div>
            <div class="modal-body">
                <div class="form-group">
                    <label>Kode Buku</label>
                    <input type="text" class="form-control" name="buku_kode" id="buku_kode">
                </div>
                <div class="form-group">
                    <label>Nama Buku</label>
                    <input type="text" class="form-control" name="buku_nama" id="buku_nama">
                </div>
                <div class="form-group">
                    <label>Jumlah</label>
                    <input type="number" class="form-control" name="jumlah" id="jumlah">
                </div>
                <div class="form-group">
                    <label>Deskripsi</label>
                    <input type="text" class="form-control" name="deskripsi" id="deskripsi">
                </div>
            </div>
            <div class="modal-footer justify-content-between">
                <button type="button" class="btn btn-default" data-dismiss="modal">Batal</button>
                <button type="submit" class="btn btn-primary">Simpan</button>
            </div>
        </div>
    </div>
    </form>
</div>

<script>
    function tambahData(){
        $('#form-data').modal('show');
        $('#form-tambah').attr('action', 'action/bukuAction.php?act=save');
        $('#buku_kode').val(''); $('#buku_nama').val(''); $('#jumlah').val(''); $('#deskripsi').val('');
    }

    function editData(id){
        $.ajax({
            url: 'action/bukuAction.php?act=get&id='+id,
            method: 'post',
            success: function(response){
                var data = JSON.parse(response);
                $('#form-data').modal('show');
                $('#form-tambah').attr('action', 'action/bukuAction.php?act=update&id='+id);
                $('#buku_kode').val(data.buku_kode);
                $('#buku_nama').val(data.buku_nama);
                $('#jumlah').val(data.jumlah);
                $('#deskripsi').val(data.deskripsi);
            }
        });
    }

    function deleteData(id){
        if(confirm('Hapus data ini?')){
            $.ajax({
                url: 'action/bukuAction.php?act=delete&id='+id,
                method: 'post',
                success: function(response){
                    var result = JSON.parse(response);
                    if(result.status){ tabelData.ajax.reload(); }
                    else{ alert(result.message); }
                }
            });
        }
    }

    var tabelData;
    $(document).ready(function(){
        tabelData = $('#table-data').DataTable({
            ajax: 'action/bukuAction.php?act=load',
        });
        
        $('#form-tambah').validate({
            rules: { buku_kode: {required:true, minlength:3}, buku_nama: {required:true} },
            errorElement: 'span',
            errorPlacement: function(error, element){
                error.addClass('invalid-feedback');
                element.closest('.form-group').append(error);
            },
            highlight: function(element){ $(element).addClass('is-invalid'); },
            unhighlight: function(element){ $(element).removeClass('is-invalid'); },
            submitHandler: function(form){
                $.ajax({
                    url: $(form).attr('action'),
                    method: 'post',
                    data: $(form).serialize(),
                    success: function(response){
                        var result = JSON.parse(response);
                        if(result.status){
                            $('#form-data').modal('hide');
                            tabelData.ajax.reload();
                        }else{ alert(result.message); }
                    }
                });
            }
        });
    });
</script>